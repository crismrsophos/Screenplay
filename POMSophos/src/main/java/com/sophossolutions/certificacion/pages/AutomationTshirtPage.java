package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationTshirtPage extends PageObject{

    By btncolor1 = By.xpath("//*[@id=\"color_1\"]");
    By btncolor2 = By.id("color_2");


    public void clicColor(String color){

        if (color.equals("Orange")){
            Action.clicTo(getDriver(), btncolor1);
        }

        else {
            Action.clicTo(getDriver(), btncolor2);
        }

    }

}
