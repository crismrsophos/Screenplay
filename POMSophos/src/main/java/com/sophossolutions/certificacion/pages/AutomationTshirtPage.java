package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationTshirtPage extends PageObject {

    By tShirtColorOrange = By.id("color_1");
    By tShirtColorBlue = By.id("color_2");
    long FIVE = 5L;

    public void clicColor(String color) {
        if (color.equals("Orange")) {
            Action.clicTo(getDriver(), tShirtColorOrange);
            Action.waitForElement(getDriver(), tShirtColorOrange, FIVE);
            Action.clicTo(getDriver(), tShirtColorOrange);
        } else {
            Action.clicTo(getDriver(), tShirtColorBlue);
            Action.waitForElement(getDriver(), tShirtColorBlue, FIVE);
            Action.clicTo(getDriver(), tShirtColorBlue);
        }
    }

}