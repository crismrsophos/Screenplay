package com.sophossolutions.certification.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.apache.http.HttpHeaders;


public class ExecutePostToken implements Task {

	private String token;
	private String endpoint;
	private Object body;

	public ExecutePostToken (String token, String endpoint, Object body) {
		super();
		this.token = token;
		this.endpoint = endpoint;
		this.body = body;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Post.to(endpoint).with(
				request -> request.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON).auth().oauth2(token).body(body)));
		SerenityRest.lastResponse().prettyPeek();
	}

	public static ExecutePostToken setInfoUser(String token, String endpoint, Object body) {
		return Tasks.instrumented(ExecutePostToken.class, token, endpoint, body);
	}
}
