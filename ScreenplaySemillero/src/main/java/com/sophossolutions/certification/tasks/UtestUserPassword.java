package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UtesPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.PASSWORD;
import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.CONFIRM_PASSWORD;
import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.CLIC_TERMINOS;
import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.CLIC_POLITICAS_PRIVACY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.BTN_COMPLETE_SETUP;


public class UtestUserPassword implements Task {
    private String password;
    private String confirmPassword;

    private Target clicTerminos;

    private Target clicPoliticas;
    private Target btnCompleteSetup;



    public UtestUserPassword (UtesPassword UTpasswprd) {
        super();
        password = UTpasswprd.getPassword();
        confirmPassword = UTpasswprd.getPassword();
        clicTerminos = CLIC_TERMINOS;
        clicPoliticas = CLIC_POLITICAS_PRIVACY;
        btnCompleteSetup = BTN_COMPLETE_SETUP;



    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD), Enter.theValue(confirmPassword).into(CONFIRM_PASSWORD),
                Click.on(clicTerminos),Click.on(clicPoliticas),Click.on(btnCompleteSetup));
    }

    public static UtestUserPassword in (UtesPassword Uinfo) {
        return Tasks.instrumented(UtestUserPassword.class, Uinfo);
    }
}
