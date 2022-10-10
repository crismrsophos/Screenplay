package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;



public class AutomationPracticeOrderPage extends PageObject {

    By proceedToCheckOutBtn = By.xpath("//*[text()='Proceed to checkout']");
    By checkBtnForBillingAddress = By.id("addressesAreEquals");

    public void clicOnProceedToCheckOut () {
        Action.clicTo(getDriver(), proceedToCheckOutBtn);
    }

    public void clicOnCheckBtnForBillingAddress () {
        Action.clicTo(getDriver(), checkBtnForBillingAddress);
    }
}
