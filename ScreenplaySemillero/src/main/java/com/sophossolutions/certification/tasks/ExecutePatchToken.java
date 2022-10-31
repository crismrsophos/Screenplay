package com.sophossolutions.certification.tasks;

import org.apache.http.HttpHeaders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;


public class ExecutePatchToken implements Task {

	private String token;
	private String endpoint;
	private Object body;

	public ExecutePatchToken(String token, String endpoint, Object body) {
		super();
		this.token = token;
		this.endpoint = endpoint;
		this.body = body;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Patch.to(endpoint).with(
				request -> request.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON).auth().oauth2(token).body(body)));
	}

	public static ExecutePatchToken setInfoUser(String token, String endpoint, Object body) {
		return Tasks.instrumented(ExecutePatchToken.class, token, endpoint, body);
	}
}
