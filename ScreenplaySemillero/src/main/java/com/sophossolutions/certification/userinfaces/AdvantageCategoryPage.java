package com.sophossolutions.certification.userinfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageCategoryPage {
    public static final Target BTN_CHOOSE_CATEGORY = Target.the("boton seleccionar categoria").locatedBy("//*[@class='rowSection']//descendant::*[contains(text(),'LAPTOPS')]");

}
