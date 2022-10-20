package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.certification.models.UserCredential;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.Inventory;
import com.sophossolutions.certification.tasks.Login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.*;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class SauceDemoLoginStepDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} navega a la pagina {string}")
	public void navegaALaPagina(String actorName, String url) {
		theActorCalled(actorName).wasAbleTo(Open.url(url));
	}

	@When("ingresa los siguientes datos")
	public void ingresaLosSiguientesDatos(UserCredential credentials) {
		theActorInTheSpotlight().attemptsTo(Login.in(credentials));
		theActorInTheSpotlight().attemptsTo(Inventory.in(credentials));
	}

	@Then("verifica que el mensaje sea {string}")
	public void verificaQueElMensajeSea(String msg) {
		theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(GetText.theField(TITLE_SAUCE), containsStringIgnoringCase(msg)));
	}

}
