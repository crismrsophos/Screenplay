package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;


public class AutomationPracticeOrderPage extends PageObject {

    By proceedToCheckOutBtn = By.xpath("//*[text()='Proceed to checkout']");
    By checkBtnForBillingAddress = By.id("addressesAreEquals");

    By email = By.id("email");
    By password = By.id("passwd");
    By signInBtn = By.id("SubmitLogin");
    By agreeTermsChkBtn = By.id("cgv");

    By unitPrice = By.id("product_price_1_2_755138");
    By quantity = By.xpath("//*[@class='cart_quantity text-center']");
    By totalShipping = By.id("total_shipping");
    By totalPrice = By.id("total_price");

    By getProceedToCheckOutShippingBtn = By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");

    public void clicOnProceedToCheckOut() {
        Action.clicTo(getDriver(), proceedToCheckOutBtn);
    }

    public void clicOnCheckBtnForBillingAddress() {
        Action.clicTo(getDriver(), checkBtnForBillingAddress);
    }

    public void loginAutomationPractice(String pEmail, String pPassword) {
        Action.setText(getDriver(), email, pEmail);
        Action.setText(getDriver(), password, pPassword);
        Action.clicTo(getDriver(), signInBtn);
    }

    public void clicOnAgreeTermsChkBtn() {
        Action.clicTo(getDriver(), agreeTermsChkBtn);
    }

    public void clicOnProceedToCheckOutShippingBtn() {
        Action.clicTo(getDriver(), getProceedToCheckOutShippingBtn);
    }

    public void validateTotalPrice() {

        float pUnitPrice = Action.getNumberOfField(getDriver(), unitPrice);
        float pQuantity = Action.getNumberOfField(getDriver(), quantity);
        float pTotalShipping = Action.getNumberOfField(getDriver(), totalShipping);
        float pTotalPrice = Action.getNumberOfField(getDriver(), totalPrice);

        if ((pUnitPrice*pQuantity+pTotalShipping) == pTotalPrice) {
            System.out.println("VALOR CORRECTO");
        } else {
            System.out.println("VALOR INCORRECTO");
        }

    }

}
