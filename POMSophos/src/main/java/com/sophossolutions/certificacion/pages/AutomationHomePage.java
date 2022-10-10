package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class AutomationHomePage extends PageObject {

    By btnTshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");

    public void goToUrl(String url) {
        Action.navegateToUrl(getDriver(), url);
    }

    public void clicTshirt(){
        Action.clicTo(getDriver(), btnTshirt);
    }




}
