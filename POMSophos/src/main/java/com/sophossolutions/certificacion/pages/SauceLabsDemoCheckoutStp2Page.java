package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoCheckoutStp2Page extends PageObject {

    By finishBtn = By.id("finish");

    public void finish () {
        Action.clicTo(getDriver(), finishBtn);
    }
}
