package com.sophossolutions.certification.tasks;
import static com.sophossolutions.certification.userinfaces.DemoQaHomePage.CLICK_BTN_FORMS;
import static com.sophossolutions.certification.userinfaces.DemoQaFormsPage.BTN_PRACTICE_FORMS;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DemoQaButtons implements Task {
    private Target btnForms;
    private Target btnPracticeForms;



    public DemoQaButtons(){
        super();
        btnForms = CLICK_BTN_FORMS;
        btnPracticeForms = BTN_PRACTICE_FORMS;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnForms),Click.on(btnPracticeForms));

    }

    public static DemoQaButtons in() {
        return  Tasks.instrumented(DemoQaButtons.class);
    }

}
