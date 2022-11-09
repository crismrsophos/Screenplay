package com.sophossolutions.certification.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyOrderPaymentPage.BTN_NEXT;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyOrderPaymentPage.BTN_PAYMENT_METHOD;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyOrderPaymentPage.BTN_PAY_NOW;
import static com.sophossolutions.certification.userinfaces.UtestHomePage.BTN_BECOME_TESTER;


public class AdvantageFullfillData implements Task {


    private Target btnNext;

    private Target btnMethod;

    private Target payNow;


    public AdvantageFullfillData(){
        super();
        btnNext = BTN_NEXT;
        btnMethod = BTN_PAYMENT_METHOD;
        payNow = BTN_PAY_NOW;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnNext),
                Click.on(btnMethod),Click.on(payNow));
    }

    public static AdvantageFullfillData in() {
        return Tasks.instrumented(AdvantageFullfillData.class);
    }

}

