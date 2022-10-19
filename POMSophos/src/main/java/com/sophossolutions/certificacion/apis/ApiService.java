package com.sophossolutions.certificacion.apis;

import java.util.Map;
import com.google.gson.JsonObject;
import org.junit.Assert;
import io.restassured.http.ContentType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

public class ApiService {

    private static String baseUrl;
    private static String lastUserID;
    public static final String TOKEN = "01975b765012c8903bfa001607d38c350e90d06c6fbeaf6006cdac04228be425";
    public static final String CONTENT_TYPE = "application/json";

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
                .auth()
                .oauth2(TOKEN)
                .body(data.toString())
                .post(baseUrl.concat(endpoint));

        SerenityRest.lastResponse().body().prettyPeek();
        Serenity.setSessionVariable("id").to(SerenityRest.lastResponse().body().jsonPath().getString("id").toString());
    }

    public static void executeGetforLastUser(String endpoint) {
        SerenityRest.given()
                .auth()
                .oauth2(TOKEN)
                .contentType(CONTENT_TYPE)
                .get(baseUrl.concat(endpoint).concat(Serenity.sessionVariableCalled("id")));
        SerenityRest.lastResponse().body().prettyPeek();
    }

    public static void executeDeleteforLastUser(String endpoint) {
        SerenityRest.given()
                .auth()
                .oauth2(TOKEN)
                .contentType(CONTENT_TYPE)
                .delete(baseUrl.concat(endpoint).concat(Serenity.sessionVariableCalled("id")));
        SerenityRest.lastResponse().body().prettyPeek();
    }
}
