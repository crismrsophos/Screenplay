package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpAddresPage {

    public static final Target USER_CITY = Target.the("Ciudad del usuario").locatedBy("id:city");

    public static final Target USER_ZIP_CODE = Target.the("ZIP code del usuario").locatedBy("id:zip");

    public static final Target BTN_USER_COUNTRY = Target.the("ZIP code del usuario").locatedBy("id:zip");

    public static final Target BTN_SELECT_COUNTRY = Target.the("ZIP code del usuario").locatedBy("id:zip");

    public static final Target BTN_NEXTDEVICES = Target.the("boton next devices").locatedBy("//*[text()='Next: Devices']");


}

