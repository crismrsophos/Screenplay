package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeSauceDemoPage {
	public static final Target TITLE_SAUCE = Target.the("el titulo").locatedBy("//*[text()='Products']");
	public static final Target BTN_ADD_PRODUCT_TO_CART = Target.the("el producto").locatedBy("//*[@name='add-to-cart-sauce-labs-backpack']");
	public static final Target BTN_GO_TO_CART = Target.the("el carro de compras").locatedBy("//*[@class='shopping_cart_badge']");
}
