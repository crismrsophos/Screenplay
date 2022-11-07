package com.sophossolutions.certification.tasks;

import com.sophossolutions.certification.models.UserQa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.NAME;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.LAST_NAME;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.EMAIL;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.GENDER;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.MOBILE_PHONE;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.DATE_OF_BIRTH;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.CLIC_SUBJECTS;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.SELECT_SUBJECTS;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.SELECT_HOBBIES;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.BTN_SELECT_FILE;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.ADDRESS;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.CLIC_STATE;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.SELECT_STATE;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.CLIC_CITY;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.SELECT_CITY;
import static com.sophossolutions.certification.userinfaces.DemoQaPracticePage.BTN_SUBMIT;



    public class DemoQAInfo implements Task {


        private String name;
        private String lastNameUser;
        private String email;
        private Target gender;
        private String mobile;
        private String dateOfBirth;

        private Target clicSubjects;

        private String selecSubjects;

        private Target selectHobbies;
        private Target btnSelectFile;

        private String addreess;

        private  Target clicStates;
        private String selectStates;
        private Target clicCity;
        private String selecCity;
        private Target btnSubmit;


        public DemoQAInfo (UserQa infoUser) {
            super();
            name = infoUser.getName();
            lastNameUser = infoUser.getLastName();
            email = infoUser.getEmail();
            gender = GENDER;
            mobile = infoUser.getMobileNumber();
            dateOfBirth = infoUser.getDateOfbirth();
            clicSubjects = CLIC_SUBJECTS;
            selecSubjects =infoUser.getSubjects();
            selectHobbies = SELECT_HOBBIES;
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
                    Click.on(GENDER),
                    Enter.theValue(mobile).into(MOBILE_PHONE),
                    Enter.theValue(dateOfBirth).into(DATE_OF_BIRTH),
                    Click.on(clicSubjects),
                    Enter.theValue(selecSubjects).into(SELECT_SUBJECTS),
                    Click.on(selectHobbies),
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

        public static DemoQAInfo in (UserQa demoQA) {
            return Tasks.instrumented(DemoQAInfo.class, demoQA);
        }
    }

