package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.StoreEndPoints;
import api.payload.Store;
import io.restassured.response.Response;

public class StoreTests {

	Faker faker;
	Store storePayload;

	@BeforeClass
	public void setupData() {
		faker = new Faker();
		storePayload = new Store();

		storePayload.setId(faker.idNumber().hashCode());
		storePayload.setPetId(faker.idNumber().hashCode());
		storePayload.setQuantity(faker.number().hashCode());
		storePayload.setShipDate(faker.date().birthday());
		storePayload.setStatus(faker.name().username());
	}
	
	@Test
	public void testPostStore() {
		Response response = StoreEndPoints.placeOrder(storePayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
