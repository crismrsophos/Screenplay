package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupPersonalPage {

    public  static final Target FIRST_NAME = Target.the("el nombre del usuario").locatedBy("id:firstName");

    public  static final Target LAST_NAME = Target.the("el apellido del usuario").locatedBy("id:lastName");

    public  static final Target EMAIL_ADDRESS = Target.the("el email del usuario").locatedBy("id:email");

    public static final Target BTN_MONTH_BIRTH = Target.the("mes de nacimiento").locatedBy("name:birthMonth");

    public static final Target BTN_SELECT_MONTH = Target.the("mes de nacimiento").locatedBy("//*[text()='February']");

    public static final Target BTN_DATE_DAY_BIRTH = Target.the("mes de nacimiento").locatedBy("name:birthDay");

    public static final Target BTN_SELECT_DAY_BIRTH = Target.the("mes de nacimiento").locatedBy("//*[text()='7']");

    public static final Target BTN_YEAR_BIRTH = Target.the("mes de nacimiento").locatedBy("name:birthYear");

    public static final Target BTN_SELECT_YEAR = Target.the("mes de nacimiento").locatedBy("//*[text()='2000']");

    public static final Target BUTTON_NEXT_LOCATION = Target.the("boton nextlocation").locatedBy("//*[text()='Next: Location']");

}
