package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageOnlineBuyOrderPaymentPage {

    public static final Target BTN_NEXT = Target.the("boton de login").locatedBy("//*[@id='next_btn']");

    public static final Target BTN_PAYMENT_METHOD = Target.the("boton de seleccionar methodo de pago").locatedBy("//*[@name='masterCredit']");

    public static final Target BTN_PAY_NOW = Target.the("boton de seleccionar methodo de pago").locatedBy("//*[@id='pay_now_btn_MasterCredit']");

}
