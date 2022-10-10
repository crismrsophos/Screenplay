package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationPracticeFadedShortSleeveTshirtsPage extends PageObject {

    By quantity = By.id("quantity_wanted");
    By sizeBtn = By.id("uniform-group_1");
    By size;
    By addToCart = By.xpath("//*[text()='Add to cart']");
    By proceedToCheckOutBtn = By.xpath("//*[@class='btn btn-default button button-medium']");
    private final long FIVE = 5L;

    public void setQuantity(String pQuantity) {
        Action.setText(getDriver(), quantity, pQuantity);
    }

    public void setSize(String pSize) {

        String sizeXPath = "//*[@title='" + pSize + "']";
        size = By.xpath(sizeXPath);
        Action.clicTo(getDriver(), sizeBtn);
        Action.clicTo(getDriver(), size);

    }

    public void clicOnAddToCart() {
        Action.clicTo(getDriver(), addToCart);
    }

    public void clicOnProceedToCheckout() {
        if (Action.waitForVisibility(getDriver(), proceedToCheckOutBtn, FIVE)) {
            Action.clicTo(getDriver(), proceedToCheckOutBtn);
        }
    }
}
