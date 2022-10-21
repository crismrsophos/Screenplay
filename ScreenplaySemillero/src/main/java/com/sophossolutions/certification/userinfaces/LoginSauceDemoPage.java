package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginSauceDemoPage {

    public static final Target USER_NAME = Target.the("el nombre de usuario").locatedBy("id:user-name");
    public static final Target PASSWORD = Target.the("el password de usuario").locatedBy("name:password");
    public static final Target BTN_LOGIN = Target.the("en el botón login").locatedBy("//*[@value='Login']");

}
