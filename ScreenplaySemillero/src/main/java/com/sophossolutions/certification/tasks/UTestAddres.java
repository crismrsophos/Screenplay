package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UtestUserAddres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.USER_CITY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.USER_ZIP_CODE;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_USER_COUNTRY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_SELECT_COUNTRY;
import static com.sophossolutions.certification.userinfaces.UtestSignUpAddresPage.BTN_NEXTDEVICES;




public class UTestAddres implements Task {

    private String city;
    private String zipCode;
    private Target btnCountry;

    private Target btnSelectCountry;

    private Target btnNextDevices;

    public UTestAddres (UtestUserAddres UTadress) {
        super();
        city = UTadress.getCity();
        zipCode = UTadress.getZipCode();
        btnCountry = BTN_USER_COUNTRY;
        btnSelectCountry = BTN_SELECT_COUNTRY;
        btnNextDevices = BTN_NEXTDEVICES;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(USER_CITY), Enter.theValue(zipCode).into(USER_ZIP_CODE),
                Click.on(btnCountry), Click.on(btnSelectCountry), Click.on(btnNextDevices));
    }

    public static UTestAddres in (UTestAddres Uinfo) {
        return Tasks.instrumented(UTestAddres.class, Uinfo);
    }
}
