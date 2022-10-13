package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoInventoryPage extends PageObject {

    By inventory = By.xpath("//*[@class='inventory_item_price']");
    String strBtnAddToCart = "(//*[@class='inventory_item_price']//following-sibling::button)[%s]";
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
