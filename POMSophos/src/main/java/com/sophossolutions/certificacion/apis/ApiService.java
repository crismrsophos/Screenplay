package com.sophossolutions.certificacion.apis;

import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class ApiService {

	private static String baseUrl = "";

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
		SerenityRest.lastResponse().body().prettyPeek();
	}

}
