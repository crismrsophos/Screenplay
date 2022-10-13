package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class SauceLabsDemoCheckoutCompletePage extends PageObject {

    By message = By.xpath("//*[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']");

    public void validateText (String _Message) {
        Action.validateTextOfField(getDriver(), message, _Message);
    }
}
