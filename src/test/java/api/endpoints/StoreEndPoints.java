package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPoints {

    public static Response placeOrder(Store payload) {
        Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
                .post(Routes.store_post_url);
        return response;
    }

    public static Response findOrder(int id) {
        Response response = given().accept(ContentType.JSON).pathParam("order_id", id).when()
                .post(Routes.store_get_url);
        return response;
    }

    public static Response deleteOrder(int id) {
        Response response = given().accept(ContentType.JSON).pathParam("order_id", id).when()
                .post(Routes.store_delete_url);
        return response;
    }

    public static Response getInventory() {
        Response response = given().accept(ContentType.JSON).when().post(Routes.store_get_inventory_url);
        return response;
    }

}
