package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.UserCredential;
import com.sophossolutions.certification.tasks.PruebaInput;
import com.sophossolutions.certification.tasks.PruebaLogin;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophossolutions.certification.userinfaces.PruebaAutomatizacionButtonsTest.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PruebaAutomationStepDefinitions {
    @When("Seleccionar usuario y contraseña de ingreso")
    public void seleccionarUsuarioYContraseñaDeIngreso(UserCredential credentials) {
        theActorInTheSpotlight().attemptsTo(PruebaLogin.in(credentials));


    }
    @When("Oprimir los botones y realizar suma")
    public void oprimirLosBotonesYRealizarSuma() {
        theActorInTheSpotlight().attemptsTo(

                Scroll.to(BOTON_CICLO_1),
                WaitUntil.the(BOTON_CICLO_1,isClickable()),
                Click.on(BOTON_CICLO_1),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1462"),
                Click.on(BTN_ENVIAR_TEST),

                Scroll.to(BOTON_CICLO_2),
                WaitUntil.the(BOTON_CICLO_2,isClickable()),
                Click.on(BOTON_CICLO_2),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1530"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_3),
                WaitUntil.the(BOTON_CICLO_3,isClickable()),
                Click.on(BOTON_CICLO_3),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1352"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_4),
                WaitUntil.the(BOTON_CICLO_4,isClickable()),
                Click.on(BOTON_CICLO_4),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1323"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_5),
                WaitUntil.the(BOTON_CICLO_5,isClickable()),
                Click.on(BOTON_CICLO_5),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1146"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_6),
                WaitUntil.the(BOTON_CICLO_6,isClickable()),
                Click.on(BOTON_CICLO_6),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1093"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_7),
                WaitUntil.the(BOTON_CICLO_7,isClickable()),
                Click.on(BOTON_CICLO_7),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1054"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_8),
                WaitUntil.the(BOTON_CICLO_8,isClickable()),
                Click.on(BOTON_CICLO_8),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("934"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_9),
                WaitUntil.the(BOTON_CICLO_9,isClickable()),
                Click.on(BOTON_CICLO_9),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1051"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_10),
                WaitUntil.the(BOTON_CICLO_10,isClickable()),
                Click.on(BOTON_CICLO_10),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1177"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_11),
                WaitUntil.the(BOTON_CICLO_11,isClickable()),
                Click.on(BOTON_CICLO_11),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1638"),
                Click.on(BTN_ENVIAR_TEST),


                Scroll.to(BOTON_CICLO_12),
                WaitUntil.the(BOTON_CICLO_12,isClickable()),
                Click.on(BOTON_CICLO_12),
                Click.on(INPUT_RESPUESTA),
                PruebaInput.in("1366"),
                Click.on(BTN_ENVIAR_TEST));
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
