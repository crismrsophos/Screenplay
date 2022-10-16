package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoCheckoutStp1Page extends PageObject {

    By name = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");

    public void setInformation (String _Name, String _LastName, String _PostalCode) {
        Action.setText(getDriver(), name, _Name);
        Action.setText(getDriver(), lastName, _LastName);
        Action.setText(getDriver(), postalCode, _PostalCode);
        Action.clicTo(getDriver(), continueBtn);
    }
}
