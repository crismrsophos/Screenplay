package com.sophossolutions.certificacion.apis;

import java.util.ArrayList;
import java.util.Map;

import groovy.lang.GString;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class ApiService {

	private static String baseUrl = "";
	private static String jsonBody= "{\"name\": \"%s\", \"email\": \"%s\",\"gender\": \"%s\",\"status\": \"%s\"}";
	private static ArrayList<String> jsonBodyArray = new ArrayList<String>();
	private static String idCreado;
	public static final String TOKEN = "01975b765012c8903bfa001607d38c350e90d06c6fbeaf6006cdac04228be425";
	public static final String CONTENT_TYPE = "application/json";

	public static void setBaseUrl(String baseUrl) {
		ApiService.baseUrl = baseUrl;
	}

	public static void executeGet(String endpoint) {
		SerenityRest.given().contentType(ContentType.JSON).get(baseUrl.concat(endpoint));
	}

	public static void endpointPost(String endpoint, Map<String, String> user){

		for (Map.Entry<String, String> entry : user.entrySet()) {
			jsonBodyArray.add(entry.getValue());
		}

		jsonBody = String.format(jsonBody, jsonBodyArray.get(0),
				jsonBodyArray.get(1), jsonBodyArray.get(2), jsonBodyArray.get(3));

		SerenityRest.given()
				.auth()
				.oauth2(TOKEN)
				.contentType(CONTENT_TYPE)
				.body(jsonBody)
				.post(baseUrl.concat(endpoint))
				//.then().assertThat()
				/*.statusCode(HttpStatus.SC_OK)*/;

		SerenityRest.lastResponse().body().prettyPeek();
		idCreado = SerenityRest.lastResponse().body().jsonPath().getString("id");

	}

	public static void endpointIdGet(String endpoint){
		SerenityRest.given()
				.auth()
				.oauth2(TOKEN)
				.contentType(CONTENT_TYPE)
				.get(baseUrl.concat(endpoint).concat(idCreado));
	}

	public static void endpointIdDelete(String endpoint){
		SerenityRest.given()
				.auth()
				.oauth2(TOKEN)
				.contentType(CONTENT_TYPE)
				.delete(baseUrl.concat(endpoint).concat(idCreado));
	}

	public static void validateStatus(int statusCode) {
		Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
	}

	public static void validateResponse(Map<String, String> booking) {
		for (Map.Entry<String, String> entry : booking.entrySet()) {
			Assert.assertEquals(entry.getValue(), SerenityRest.lastResponse()
					.getBody()
					.jsonPath()
					.get(entry.getKey()));
		}
		SerenityRest.lastResponse()
				.body()
				.prettyPeek();
	}

}
