package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UtestUserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.UtestHomePage.BTN_BECOME_TESTER;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.FIRST_NAME;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.LAST_NAME;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.EMAIL_ADDRESS;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_MONTH_BIRTH;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_SELECT_MONTH;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_DATE_DAY_BIRTH;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_SELECT_DAY_BIRTH;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_YEAR_BIRTH;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BTN_SELECT_YEAR;
import static com.sophossolutions.certification.userinfaces.UtestSignupPersonalPage.BUTTON_NEXT_LOCATION;




public class UTestPersonalInfo implements Task {

    private Target btnBecomeTester;
    private String firstName;
    private String lastNameUser;
    private String emailUser;
    private Target btnMonthBirth;

    private Target btnSelectMonthBirth;

    private Target btnDaybirth;

    private Target btnSelectDay;
    private Target btnYearBirth;

    private Target btnSelectYear;

    private  Target btnNextLocation;

    public UTestPersonalInfo (UtestUserInfo informationUser) {
        super();
        btnBecomeTester = BTN_BECOME_TESTER;
        firstName = informationUser.getFirtsName();
        lastNameUser = informationUser.getLastName();
        emailUser = informationUser.getEmailAddress();
        btnMonthBirth = BTN_MONTH_BIRTH;
        btnSelectMonthBirth = BTN_SELECT_MONTH;
        btnDaybirth =BTN_DATE_DAY_BIRTH;
        btnSelectDay = BTN_SELECT_DAY_BIRTH;
        btnYearBirth = BTN_YEAR_BIRTH;
        btnSelectYear = BTN_SELECT_YEAR;
        btnNextLocation = BUTTON_NEXT_LOCATION;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnBecomeTester),Enter.theValue(firstName).into(FIRST_NAME), Enter.theValue(lastNameUser).into(LAST_NAME),
                Enter.theValue(emailUser).into(EMAIL_ADDRESS), Click.on(btnMonthBirth), Click.on(btnSelectMonthBirth),
                Click.on(btnDaybirth), Click.on(btnSelectDay), Click.on(btnYearBirth), Click.on(btnSelectYear),Click.on(btnNextLocation));
    }

    public static UTestPersonalInfo in (UtestUserInfo Uinfo) {
        return Tasks.instrumented(UTestPersonalInfo.class, Uinfo);
    }
}
