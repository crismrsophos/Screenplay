package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationBuyProceedPage extends PageObject {

    By btnCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");


    By email = By.id("email");
    By password = By.id("passwd");
    By btnSign = By.id("SubmitLogin");


    By btnCheckout2 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");

    By btnAgree = By.id("cgv");

    By btnCheckoutShipping = By.xpath("//*[@id=\"form\"]/p/button/span");


    By totalF = By.id("total_price");




    public void clicCheckout(){
        Action.clicTo(getDriver(), btnCheckout);
    }

    public void signAutomation(String email, String password){
        Action.setText(getDriver(), this.email, email);
        Action.setText(getDriver(), this.password, password);
        Action.clicTo(getDriver(), btnSign);

    }

    public void clicCheckoutA(){

        Action.clicTo(getDriver(), btnCheckout2);

    }

    public void clicAgree(){
        Action.clicTo(getDriver(), btnAgree);
        Action.clicTo(getDriver(), btnCheckoutShipping);
    }

    public void comparation(String total){

        Action.validateTextOfField(getDriver(), totalF, total );

    }


}
