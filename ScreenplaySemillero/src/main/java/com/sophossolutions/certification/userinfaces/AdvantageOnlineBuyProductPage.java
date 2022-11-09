package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageOnlineBuyProductPage {
    public static final Target COLOR = Target.the("boton seleccionar color").locatedBy("//span[@title='{0}']");

    public static final Target QUANTITY = Target.the("boton seleccionar cantidad").locatedBy("//*[@name='quantity']");

    public static final Target BTN_ADD_TO_CART = Target.the("boton añadir al carrito").locatedBy("//*[@name='save_to_cart']");

    public static final Target BTN_CHECKOUT = Target.the("boton de checkout").locatedBy("//*[@id='checkOutPopUp']");
}
