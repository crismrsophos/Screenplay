package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationSelectPage extends PageObject {

    By btnQuantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span");

    By btnSize = By.xpath("//*[@id=\"group_1\"]");

    By btnSize1;

    By btnCar = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

    By btnCheckout = By.xpath("//*[@title='Proceed to checkout']");

    public void clicSelect(String quantity, String size){

        int i = Integer.parseInt(quantity);
        for (int j = 1; j < i; j++){
            Action.clicTo(getDriver(), btnQuantity);
        }

        //Action.clicTo(getDriver(), btnSize);

        if (size.equals("S")){
            btnSize1 = By.xpath("//*[@id=\"group_1\"]/option[1]");
            Action.clicTo(getDriver(), btnSize1);

        } else if (size.equals("M")) {
            btnSize1 = By.xpath("//*[@id=\"group_1\"]/option[2]");
            Action.clicTo(getDriver(), btnSize1);
        } else if (size.equals("L")){
            btnSize1 = By.xpath("//*[@id=\"group_1\"]/option[3]");
            Action.clicTo(getDriver(), btnSize1);
        }

        Action.clicTo(getDriver(), btnCar);
        if(Action.waitForElement(getDriver(),btnCheckout,6)){
            Action.clicTo(getDriver(), btnCheckout);
        }



    }


}
