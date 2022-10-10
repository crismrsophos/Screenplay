package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationPracticeHomePage extends PageObject{

    By tShirtsSection = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");

    public void clicOnTshirts () {
        Action.clicTo(getDriver(), tShirtsSection);
    }
}
