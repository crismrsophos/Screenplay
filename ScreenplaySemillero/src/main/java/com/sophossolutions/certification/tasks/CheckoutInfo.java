package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.CheckoutInformationPage.FIRST_NAME;
import static com.sophossolutions.certification.userinfaces.CheckoutInformationPage.LAST_NAME;
import static com.sophossolutions.certification.userinfaces.CheckoutInformationPage.POSTAL_CODE;
import static com.sophossolutions.certification.userinfaces.CheckoutInformationPage.BTN_CONTINUE;

import com.sophossolutions.certification.models.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInfo implements Task {


        private String name;
        private String lastName;
        private String postalCode;

        private Target btnContinue;

        public CheckoutInfo (UserInformation information) {
            super();
                name = information.getName();
                lastName = information.getLastname();
                postalCode = information.getPostalcode();

                btnContinue = BTN_CONTINUE;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(name).into(FIRST_NAME), Enter.theValue(lastName).into(LAST_NAME),
                    Enter.theValue(postalCode).into(POSTAL_CODE),Click.on(btnContinue));
        }

    public static CheckoutInfo info(UserInformation information) {
        return Tasks.instrumented(CheckoutInfo.class, information);
    }

    public static CheckoutInfo in() {
        return Tasks.instrumented(CheckoutInfo.class);
    }

    }

