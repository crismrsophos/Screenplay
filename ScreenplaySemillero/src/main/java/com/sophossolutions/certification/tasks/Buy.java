package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.CheckOutStepOneSauceDemo.FIRST_NAME;
import static com.sophossolutions.certification.userinfaces.CheckOutStepOneSauceDemo.LAST_NAME;
import static com.sophossolutions.certification.userinfaces.CheckOutStepOneSauceDemo.POSTAL_CODE;
import static com.sophossolutions.certification.userinfaces.CheckOutStepOneSauceDemo.BTN_CONTINUE;

import com.sophossolutions.certification.models.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Buy implements Task {


        private String name;
        private String lastName;
        private String postalCode;

        private Target btnContinue;

        public Buy(UserInformation information) {
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

    public static Buy info(UserInformation information) {
        return Tasks.instrumented(Buy.class, information);
    }

    }

