package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationHomePage extends PageObject {

    By registrationSection;
    String strRegistrationSection = "//a[text()='%s']";

    public void clicRegistration(String section) {
        registrationSection = By.xpath(String.format(strRegistrationSection, section));
        Action.clicTo(getDriver(), registrationSection);
    }
}
