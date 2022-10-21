package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.CartSauceDemoPage.BTN_CHECKOUT;
import static com.sophossolutions.certification.userinfaces.CheckoutStepOneSauceDemoPage.*;
import static com.sophossolutions.certification.userinfaces.CheckoutStepTwoSauceDemoPage.BTN_FINISH;

import com.sophossolutions.certification.models.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Buy implements Task {
    private String firstname;
    private String lastname;
    private String postalCode;
    private Target btnCheckout;
    private Target btnContinue;
    private Target btnFinish;

    public Buy(UserInformation data) {
        super();
        firstname = data.getFirstname();
        lastname = data.getLastname();
        postalCode = data.getPostalCode();
        btnCheckout = BTN_CHECKOUT;
        btnContinue = BTN_CONTINUE;
        btnFinish = BTN_FINISH;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnCheckout),
                Enter.theValue(firstname).into(FIRSTNAME),
                Enter.theValue(lastname).into(LASTNAME),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                Click.on(btnContinue),
                Click.on(btnFinish));
    }

    public static Buy checkoutProcess(UserInformation credentials) {
        return Tasks.instrumented(Buy.class, credentials);
    }
}
