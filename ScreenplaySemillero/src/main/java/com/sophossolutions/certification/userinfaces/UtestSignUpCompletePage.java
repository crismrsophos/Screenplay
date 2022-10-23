package com.sophossolutions.certification.userinfaces;


import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpCompletePage {
    public static final Target PASSWORD = Target.the("ingrese la contraseña").locatedBy("id:password");

    public static final Target CONFIRM_PASSWORD = Target.the("confirme la contraseña").locatedBy("id:confirmPassword");

    public static final Target CLIC_TERMINOS = Target.the("clic confirmar terminos de uso").locatedBy(" (//*[@class='checkmark signup-consent__checkbox error'])[1]");

    public static final Target CLIC_POLITICAS_PRIVACY = Target.the("clic confirmar privacidad").locatedBy(" (//*[@class='checkmark signup-consent__checkbox error'])[2]");

    public static final Target BTN_COMPLETE_SETUP = Target.the("clic en el boton").locatedBy("//*[@id=regs_container]/div/div[2]/div/div[2]/div/form/div[2]/div/a");
}
