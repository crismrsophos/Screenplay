package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageOnlineBuyLoginPage {

    public static final Target USER_NAME = Target.the("´campo de username").locatedBy("//*[@name='usernameInOrderPayment']");

    public static final Target PASSWORD = Target.the("´campo de password").locatedBy("//*[@name='passwordInOrderPayment']");

    public static final Target BTN_LOGIN = Target.the("boton de login").locatedBy("//*[@id='login_btnundefined']");
}
