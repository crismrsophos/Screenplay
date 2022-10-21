package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutStepOneSauceDemo {
    public static final Target FIRST_NAME = Target.the("el nombre del usuario").locatedBy("name:firstName");

    public static final Target LAST_NAME = Target.the("el apellido del usuario").locatedBy("name:lastName");

    public  static final Target POSTAL_CODE = Target.the("el apellido del usuario").locatedBy("id:postal-code");

    public static final Target BTN_CONTINUE = Target.the("boton continue").locatedBy("//*[@id=\"continue\"]");

}
