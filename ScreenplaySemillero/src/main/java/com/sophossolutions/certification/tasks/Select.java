package com.sophossolutions.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_ADD_PRODUCT_TO_CART;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.BTN_GO_TO_CART;

public class Select implements Task {
    private String product;
    private Target btnAddProductToCart;
    private Target btnGoToCart;

    public Select(String product) {
        this.product = product;
        btnAddProductToCart = BTN_ADD_PRODUCT_TO_CART.of(product);
        btnGoToCart = BTN_GO_TO_CART;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnAddProductToCart),
                Click.on(btnGoToCart));
    }

    public static Select theProduct(String product) {
        return Tasks.instrumented(Select.class, product);
    }
}

