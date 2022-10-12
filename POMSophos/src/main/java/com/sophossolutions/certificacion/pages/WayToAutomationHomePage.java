package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class WayToAutomationHomePage extends PageObject{

    By clicRegistration = By.xpath("//*[@id=\"toggleNav\"]/li[6]/a");


    public void clickHome(){
        Action.clicTo(getDriver(),clicRegistration);

    }


}
