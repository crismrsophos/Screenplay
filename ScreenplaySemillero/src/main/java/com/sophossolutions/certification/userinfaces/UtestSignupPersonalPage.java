package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestSignupPersonalPage {

    public  static final Target FIRST_NAME = Target.the("el nombre del usuario").locatedBy("id:firstName");

    public  static final Target LAST_NAME = Target.the("el apellido del usuario").locatedBy("id:lastName");

    public  static final Target EMAIL_ADDRESS = Target.the("el email del usuario").locatedBy("id:email");

    public static final Target BTN_MONTH_BIRTH = Target.the("mes de nacimiento").locatedBy("name:birthMonth");

    public static final Target BTN_SELECT_MONTH = Target.the("mes de nacimiento").locatedBy("name:birthMonth");

    public static final Target DATE_DAY_BIRTH = Target.the("mes de nacimiento").locatedBy("name:birthDay");

    public static final Target DATE_DAY_YEAR = Target.the("mes de nacimiento").locatedBy("name:birthYear");

    public static final Target BUTTON_NEXLOCATION = Target.the("boton nextlocation").locatedBy("//*[@id=regs_container]/div/div[2]/div/div[2]/div/form/div[2]/a");

}
