package com.sophossolutions.certification.stepdefinitions;


import com.sophossolutions.certification.models.Booking;


import com.sophossolutions.certification.tasks.ExecutePartialUpdate;
import io.cucumber.java.en.When;


import static com.sophossolutions.certification.constans.Secret.TOKEN_BOOKING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookingPartialUpdateStepDefinitions {
    @When("ejecuta el método patch booking {string} con los siguientes datos")
    public void ejecutaElMétodoPatchBookingBookingConLosSiguientesDatos(String endpoint,Booking booking) {
        theActorInTheSpotlight().attemptsTo(ExecutePartialUpdate.setInfoUser( TOKEN_BOOKING,endpoint, booking));

    }
}