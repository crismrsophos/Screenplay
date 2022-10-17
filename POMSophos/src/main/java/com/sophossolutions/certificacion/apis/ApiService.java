package com.sophossolutions.certificacion.apis;

import java.util.Map;

import com.google.gson.JsonObject;
import io.restassured.http.Header;
import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class ApiService {

	private static String baseUrl;

	public static void setBaseUrl(String baseUrl) {
		ApiService.baseUrl = baseUrl;
	}

	public static void executeGet(String endpoint) {
		SerenityRest.given().contentType(ContentType.JSON).get(baseUrl.concat(endpoint));
	}

	public static void validateStatus(int statusCode) {
		Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
	}

	public static void validateResponse(Map<String, String> booking) {
		for (Map.Entry<String, String> entry : booking.entrySet()) {
			Assert.assertEquals(entry.getValue(), SerenityRest.lastResponse().getBody().jsonPath().get(entry.getKey()));

		}
	}

	public static void executePost(String endpoint, Map<String, String> newUserData) {
		JsonObject data = new JsonObject();

		for (Map.Entry<String, String> entry : newUserData.entrySet()) {
			data.addProperty(entry.getKey(), entry.getValue());
		}

		SerenityRest.given()
				.contentType(ContentType.JSON)
				.header("Authorization", " Bearer 851e30583ee2be4656b7f50749c7b7a5860b1adf01fbf110c840106c70ef7246")
				.body(data.toString())
				.post(baseUrl.concat(endpoint));

		SerenityRest.lastResponse().body().prettyPeek();
	}

	public static void executeGetforLastUser(String endpoint) {
		String lastUserID = SerenityRest.lastResponse().body().jsonPath().getString("id"); //Preguntar a Rigo en clase
		SerenityRest.given()
				.contentType(ContentType.JSON)
				.header("Authorization", " Bearer 851e30583ee2be4656b7f50749c7b7a5860b1adf01fbf110c840106c70ef7246")
				.get(baseUrl.concat(endpoint).concat(lastUserID));

		SerenityRest.lastResponse().body().prettyPeek();
	}

	public static void executeDeleteforLastUser(String endpoint) {
		String lastUserID = SerenityRest.lastResponse().body().jsonPath().getString("id");
		SerenityRest.given()
				.contentType(ContentType.JSON)
				.header("Authorization", " Bearer 851e30583ee2be4656b7f50749c7b7a5860b1adf01fbf110c840106c70ef7246")
				.delete(baseUrl.concat(endpoint).concat(lastUserID));

		SerenityRest.lastResponse().body().prettyPeek();
	}
}
