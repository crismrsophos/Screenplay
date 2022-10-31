package com.sophossolutions.certification.tasks;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import org.apache.http.HttpHeaders;

import static com.sophossolutions.certification.constans.Secret.TOKEN_BOOKING;

public class ExecutePartialUpdate implements Task {
    private String token;
    private String endpoint;
    private Object body;

    public ExecutePartialUpdate(String token, String endpoint, Object body) {
        super();
        this.token = token;
        this.endpoint = endpoint;
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Patch.to(endpoint).with(
                request -> request
                        .header(HttpHeaders.CONTENT_TYPE, ContentType.JSON)
                        .header(HttpHeaders.ACCEPT, ContentType.JSON)
                        .header("Cookie" ,"token=" + TOKEN_BOOKING)
                        .body(body)));
        SerenityRest.lastResponse().prettyPeek();
    }

    public static ExecutePartialUpdate setInfoUser(String token, String endpoint, Object body) {
        return Tasks.instrumented(ExecutePartialUpdate.class, token, endpoint, body);
    }

}
