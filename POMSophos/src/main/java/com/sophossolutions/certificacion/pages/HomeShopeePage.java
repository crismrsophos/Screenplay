package com.sophossolutions.certificacion.pages;
import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class HomeShoope extends PageObject {


    By clicBackground = By.className("home-popup__background");
    By btnComputacion = By.xpath("(//*[@class='_1l+Pw-'])[10]");

    public void goToUrl(String url) {
        Action.navegateToUrl(getDriver(), url);
    }

    public void HomeShopeePage() {

        Action.clicTo(getDriver(), btnComputacion);
        Action.clicTo(getDriver(), clicBackground);
    }


}
