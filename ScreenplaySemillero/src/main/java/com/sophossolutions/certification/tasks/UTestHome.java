package com.sophossolutions.certification.tasks;
import static com.sophossolutions.certification.userinfaces.UtestHomePage.BTN_BECOME_TESTER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class UTestHome implements Task {


    private Target btnBecomeTester;



    public  UTestHome () {
        super();
        btnBecomeTester = BTN_BECOME_TESTER;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnBecomeTester));
    }

    public static UTestHome in() {
        return Tasks.instrumented(UTestHome.class);
    }

}
