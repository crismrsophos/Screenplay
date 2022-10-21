package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_ADD_TO_CAR;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_CARD;
import static com.sophossolutions.certification.userinfaces.CarDemoSaucePage.BTN_CHECKOUT;

import com.sophossolutions.certification.models.UserCredential;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Inventory implements Task {


    private Target btnAddCar;

    private Target btnCar;
    private Target btnCheckout;

    public Inventory() {
        super();
        btnAddCar = BTN_ADD_TO_CAR;
        btnCar = BTN_CARD;
        btnCheckout = BTN_CHECKOUT;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnAddCar),Click.on(btnCar),Click.on(btnCheckout));
    }

    public static Inventory in() {
        return Tasks.instrumented(Inventory.class);
    }

}


