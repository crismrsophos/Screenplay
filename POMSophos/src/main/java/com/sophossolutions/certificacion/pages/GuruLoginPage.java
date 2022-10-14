package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;

import com.sophossolutions.certificacion.utilities.GetTarget;

import net.serenitybdd.core.pages.PageObject;

public class GuruLoginPage extends PageObject {

    public void goToUrl(String url) {
        Action.navegateToUrl(getDriver(), url);
    }

    public void login(String user, String passw, String app) {
        Action.setText(getDriver(), GetTarget.ofApp(app).get(0), user);
        Action.setText(getDriver(), GetTarget.ofApp(app).get(1), passw);
        Action.clicTo(getDriver(), GetTarget.ofApp(app).get(2));
    }

}
