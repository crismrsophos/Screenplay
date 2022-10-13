package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoCartPage extends PageObject {
    By checkoutBtn = By.id("checkout");

    public void checkout () {
        Action.clicTo(getDriver(), checkoutBtn);
    }
}
