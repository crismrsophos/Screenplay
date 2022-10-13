package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;

import com.sophossolutions.certificacion.utils.GetTarget;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoInventoryPage extends PageObject {

    By inventory = By.xpath("//*[@class='pricebar']");
    String strBtnAddToCart = "(//*[@class='btn btn_primary btn_small btn_inventory'])[%s]";
    By shoppingCarBtn = By.xpath("//*[@class='shopping_cart_link']");
    public void findProducts (String maxValue) {
        Action.selectProductsWithValueUnderOf(getDriver(), inventory, strBtnAddToCart, maxValue);
    }

    public void goToShoppingCart() {
        Action.clicTo(getDriver(), shoppingCarBtn);

    }

    public void selectProductsAndCheckout (String maxValue) {
        findProducts(maxValue);
        goToShoppingCart();

    }

}
