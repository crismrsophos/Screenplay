package com.sophossolutions.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.CheckOutStepTwoSauceDemoPage.BTN_FINISH;



public class FinishBuy implements Task {
    private Target btnFinish;

    public FinishBuy () {
        super();
        btnFinish = BTN_FINISH;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnFinish));


    }

    public static FinishBuy in() {
        return Tasks.instrumented(FinishBuy.class);
    }}