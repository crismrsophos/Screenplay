package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationHomePage extends PageObject {

    String selectedSection = "//a[text()='%s']";
    By section;

    public void goToSection(String _registerSection) {
        section = By.xpath(String.format(selectedSection, _registerSection));
        Action.clicTo(getDriver(), section);
        Action.moveToNewWindow(getDriver());
    }

}
