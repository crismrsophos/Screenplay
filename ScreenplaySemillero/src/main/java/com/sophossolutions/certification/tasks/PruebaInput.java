package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UserCredential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;


import static com.sophossolutions.certification.userinfaces.PruebaAutomatizacionButtonsTest.INPUT_RESPUESTA;

public class PruebaInput implements Task {
    private String inputRespuesta;

    public PruebaInput(String inputRespuesta) {
        super();
        this.inputRespuesta = inputRespuesta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(inputRespuesta).into(INPUT_RESPUESTA));
    }

    public static PruebaInput in(String inputRespuesta) {
        return Tasks.instrumented(PruebaInput.class, inputRespuesta);
    }
}
