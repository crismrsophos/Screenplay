package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import com.sophossolutions.certificacion.utils.GetTarget;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoHomePage extends PageObject {

    public void login (String userName, String password, String app) {
        Action.setText(getDriver(), GetTarget.ofApp(app).get(0), userName);
        Action.setText(getDriver(), GetTarget.ofApp(app).get(1), password);
        Action.clicTo(getDriver(), GetTarget.ofApp(app).get(2));
    }
}
