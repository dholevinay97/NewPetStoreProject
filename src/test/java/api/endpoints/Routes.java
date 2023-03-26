package api.endpoints;

/*

Swagger URL --> https://petstore.swagger.io

Create user (Post) : https://petstore.swagger.io/v2/user
Get User    (Get)  : https://petstore.swagger.io/v2/user/{username}
Update User (Put)  : https://petstore.swagger.io/v2/user/{username}
Delete User (Delete)  : https://petstore.swagger.io/v2/user/{username}
 
*/

public class Routes {

	// User Module
	
	public static String base_url = "https://petstore.swagger.io/v2";

	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";
	
	//Store module
	
	public static String store_base_url = "https://petstore.swagger.io/v2/store";
	
	public static String store_post_url = store_base_url + "/order";
	public static String store_get_url = store_base_url + "/order/{order_id}";
	public static String store_delete_url = store_base_url + "/order/{order_id}";
	public static String store_get_inventory_url = store_base_url + "/inventory";
	
	//Pet Module
	

}
