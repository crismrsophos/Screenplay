package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UserCredential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyLoginPage.*;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyOrderPaymentPage.*;

public class AdvantageLogin implements Task {
    private String username;
    private String password;

    private Target btnLogin;




    public AdvantageLogin(UserCredential credential) {
        super();
        username = credential.getUsername();
        password = credential.getPassword();
        btnLogin = BTN_LOGIN;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(USER_NAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(btnLogin));
    }

    public static AdvantageLogin in(UserCredential products) {
        return Tasks.instrumented(AdvantageLogin.class, products);
    }
}



