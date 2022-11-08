package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UserQa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.*;


public class DemoQAInfo implements Task {


    private String name;
    private String lastNameUser;
    private String email;
    private Target gender;
    private String mobile;

    private Target clicDateOfBirth;
    private String dateOfBirth;

    private Target clicSubjects;

    private String selecSubjects;

    private Target selectHobbies;

    private Target selecHobbies2;
    private Target btnSelectFile;

    private String addreess;

    private Target clicStates;
    private String selectStates;
    private Target clicCity;
    private String selecCity;
    private Target btnSubmit;


    public DemoQAInfo(UserQa infoUser) {
        super();
        name = infoUser.getName();
        lastNameUser = infoUser.getLastName();
        email = infoUser.getEmail();
        gender = GENDER;
        mobile = infoUser.getMobileNumber();
        clicDateOfBirth = CLIC_DATE_OF_BIRTH;
        dateOfBirth = infoUser.getDateOfbirth();
        clicSubjects = CLIC_SUBJECTS;
        selecSubjects = infoUser.getSubjects();
        selectHobbies = SELECT_HOBBIES;
        selecHobbies2 = SELECT_HOBBIES2;
        btnSelectFile = BTN_SELECT_FILE;
        addreess = infoUser.getAddress();
        clicStates = CLIC_STATE;
        selectStates = infoUser.getState();
        clicCity = CLIC_CITY;
        selecCity = infoUser.getCity();
        btnSubmit = BTN_SUBMIT;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(name).into(NAME),
                Enter.theValue(lastNameUser).into(LAST_NAME),
                Enter.theValue(email).into(EMAIL),
                Click.on(gender),
                Enter.theValue(mobile).into(MOBILE_PHONE),
                Click.on(clicDateOfBirth),
                Enter.theValue(dateOfBirth).into(DATE_OF_BIRTH),
                Click.on(clicSubjects),
                Enter.theValue(selecSubjects).into(SELECT_SUBJECTS),
                Click.on(selectHobbies),
                Click.on(selecHobbies2),
                Click.on(btnSelectFile),
                Enter.theValue(addreess).into(ADDRESS),
                Click.on(clicStates),
                Enter.theValue(selectStates).into(SELECT_STATE),
                Click.on(clicStates),
                Enter.theValue(selectStates).into(SELECT_STATE),
                Click.on(clicCity),
                Enter.theValue(selecCity).into(SELECT_CITY),
                Click.on(btnSubmit));
    }

    public static DemoQAInfo in(UserQa demoQA) {
        return Tasks.instrumented(DemoQAInfo.class, demoQA);
    }
}

