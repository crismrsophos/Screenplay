package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import com.sophossolutions.certificacion.models.newUserWay2Automation;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationHomePage extends PageObject {

    By registrationSection = By.xpath("//a[text()='Registration']"); //PDTE mejorar

    public void goToSection() {
        Action.clicTo(getDriver(), registrationSection);
        Action.moveToNewWindow(getDriver());
    }

}
