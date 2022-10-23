package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UtestUserAddres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;



//import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.USER_CITY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.USER_ZIP_CODE;
//import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_USER_COUNTRY;
//import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_SELECT_COUNTRY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_NEXTDEVICES;
import static com.sophossolutions.certification.userinfaces.UtestSignUpCompletePage.BTN_LAST_STEP;



public class UTestAddres implements Task {

    private String zipCode;

    private Target btnNextDevices;
    private Target btnLastStep;

    public UTestAddres (UtestUserAddres UTadress) {
        super();
        zipCode = UTadress.getZipCode();
        btnNextDevices = BTN_NEXTDEVICES;
        btnLastStep = BTN_LAST_STEP;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(btnNextDevices, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(zipCode).into(USER_ZIP_CODE),
                Click.on(btnNextDevices), Click.on(btnLastStep));
    }

    public static UTestAddres in (UtestUserAddres Uaddress) {
        return Tasks.instrumented(UTestAddres.class, Uaddress);
    }
}
