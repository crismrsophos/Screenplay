package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UserCredential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.PruebaAutomatizacionLoginPage.*;

public class PruebaLogin implements Task {

    private String usuario;
    private String contraseña;
    private Target btnEnviar;

    public PruebaLogin(UserCredential credentials) {
        super();
        usuario = credentials.getUsername();
        contraseña = credentials.getPassword();
        btnEnviar = BTN_ENVIAR;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(USUARIO), Enter.theValue(contraseña).into(CONTRASEÑA),
                Click.on(btnEnviar));
    }

    public static PruebaLogin in(UserCredential credentials) {
        return Tasks.instrumented(PruebaLogin.class, credentials);
    }
}
