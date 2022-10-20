package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.CheckoutBuySauceDemoPage.*;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_ADD_PRODUCT_TO_CART;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_GO_TO_CART;

import com.sophossolutions.certification.models.CheckoutBuySauceCredential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class CheckouBuySauce implements Task {
    private String firstname;
    private String lastname;
    private String postalCode;
    private Target btnCheckout;
    private Target btnContinue;
    private Target btnFinish;

    public CheckouBuySauce(CheckoutBuySauceCredential credentials) {
        super();
        firstname = credentials.getFirstname();
        lastname = credentials.getLastname();
        postalCode = credentials.getPostalCode();



        btnCheckout = BTN_CHECKOUT;
        btnContinue = BTN_CONTINUE;
        btnFinish = BTN_FINISH;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.theProduct(),
                Click.on(btnCheckout),
                Enter.theValue(firstname).into(FIRSTNAME),
                Enter.theValue(lastname).into(LASTNAME),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                Click.on(btnContinue),
                Click.on(btnFinish));
    }

    public static CheckouBuySauce checkoutProcess(CheckoutBuySauceCredential credentials) {
        return Tasks.instrumented(CheckouBuySauce.class, credentials);
    }
}
