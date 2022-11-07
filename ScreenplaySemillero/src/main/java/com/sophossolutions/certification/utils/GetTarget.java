package com.sophossolutions.certification.utils;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.TITLE_SAUCE;
import static com.sophossolutions.certification.userinfaces.CheckOutStepOneSauceDemo.FIRST_NAME;
//import static com.sophossolutions.certification.userinfaces.CheckoutCompleteSauceDemoPage.TITTLE_PURCHARSE;

import net.serenitybdd.screenplay.targets.Target;

public class GetTarget {

        public static Target page(String page) {
            switch (page) {
                case "Sauce Home":
                    return TITLE_SAUCE;
               /* case "Sauce Complete":
                    return TITTLE_PURCHARSE;*/
                default:
                    break;
            }
            return FIRST_NAME; // Organizar esto
    }
}
