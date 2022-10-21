package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutStepOneSauceDemoPage {
    public static final Target FIRSTNAME = Target.the("el nombre del comprador").locatedBy("id:first-name");
    public static final Target LASTNAME = Target.the("el apellido del comprador").locatedBy("id:last-name");
    public static final Target POSTAL_CODE = Target.the("el código postal del comprador").locatedBy("id:postal-code");
    public static final Target BTN_CONTINUE = Target.the("el botón de continuar").locatedBy("id:continue");
}
