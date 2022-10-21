package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.commons.compress.archivers.tar.TarFile;

public class HomeSauceDemoPage {

	public static final Target TITLE_SAUCE = Target.the("el titulo").locatedBy("//*[text()='Products']");

	public static final  Target BTN_ADD_TO_CAR = Target.the("Boton Add to car").locatedBy("(//*[@class='inventory_item_price']//following-sibling::button)[6]");

	public static final  Target BTN_CARD = Target.the("Boton carrito").locatedBy("//*[@id=\"shopping_cart_container\"]/a");



	
}
