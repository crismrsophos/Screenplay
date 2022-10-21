package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_ADD_TO_CAR;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_CAR;
import static com.sophossolutions.certification.userinfaces.CartSauceDemoPage.BTN_CHECKOUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Task {


    private Target btnAddCar;

    private Target btnCar;
    private Target btnCheckout;

    public Select() {
        super();
        btnAddCar = BTN_ADD_TO_CAR;
        btnCar = BTN_CAR;
        btnCheckout = BTN_CHECKOUT;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnAddCar),Click.on(btnCar),Click.on(btnCheckout));
    }

    public static Select in() {
        return Tasks.instrumented(Select.class);
    }

}


