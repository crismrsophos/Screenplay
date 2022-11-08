package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoQaPracticePage {

    public static final Target NAME = Target.the("campo de first name").locatedBy("(//*[@id='firstName'])");

    public static final Target LAST_NAME = Target.the("campo de last name").locatedBy("(//*[@id='lastName'])");

    public static final Target EMAIL = Target.the("campo de email").locatedBy("(//*[@id='userEmail'])");

    public static final Target GENDER = Target.the("campo de genero").locatedBy("//*[@class='custom-control-label' and text()='Male']");

    public static final Target MOBILE_PHONE = Target.the("campo de numero").locatedBy("//*[@id='userNumber']");

    public static final Target CLIC_DATE_OF_BIRTH = Target.the("clic campo de fecha de nacimiento").locatedBy("(//*[@id='dateOfBirthInput'])");

    public static final Target DATE_OF_BIRTH = Target.the("campo de fecha de nacimiento").locatedBy("//*[@id='dateOfBirthInput']//self::*[contains(value(),'07 Feb 2022')]");

    public static final Target CLIC_SUBJECTS = Target.the("clic a subjects").locatedBy("(//*[@id='subjectsContainer'])");

    public static final Target SELECT_SUBJECTS = Target.the("seleccionar subjects").locatedBy("");

    public static final Target SELECT_HOBBIES = Target.the("seleccionar subjects").locatedBy("(//*[@class='custom-control-label'])[4]");

    public static final Target SELECT_HOBBIES2 = Target.the("seleccionar subjects").locatedBy("(//*[@class='custom-control-label'])[5]");

    public static final Target BTN_SELECT_FILE = Target.the("campo de email").locatedBy("(//*[@id='uploadPicture'])");

    public static final Target ADDRESS = Target.the("campo de direccion").locatedBy("(//*[@id='currentAddress'])");

    public static final Target CLIC_STATE = Target.the("campo de estado").locatedBy("(//*[@id='state'])");

    public static final Target SELECT_STATE = Target.the("campo seleccionar estado").locatedBy("(//*[@class=' css-1hwfws3'])[1]");

    public static final Target CLIC_CITY = Target.the("campo de clic ciudad").locatedBy("(//*[@id='city'])");

    public static final Target SELECT_CITY = Target.the("campo de seleccionar ciudad").locatedBy("");

    public static final Target BTN_SUBMIT = Target.the("campo de boton submit").locatedBy("(//*[@class='btn btn-primary'])");

}
