package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationPracticeTshirtsPage extends PageObject {

    By tShirtColorBlue = By.id("color_2");

    public void clicOnBlueTshirt() {
        Action.clicTo(getDriver(), tShirtColorBlue);
    }
}
