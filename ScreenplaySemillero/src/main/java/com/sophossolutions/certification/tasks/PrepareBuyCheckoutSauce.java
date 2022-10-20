package com.sophossolutions.certification.tasks;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.*;
import com.sophossolutions.certification.models.PrepareForCheckoutSauce;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PrepareBuyCheckoutSauce implements Task {
    private final Target btnAddProductToCart;
    private final Target btnGoToCart;

    public PrepareBuyCheckoutSauce(PrepareForCheckoutSauce data) {
        super();
        btnAddProductToCart = BTN_ADD_PRODUCT_TO_CART;
        btnGoToCart = BTN_GO_TO_CART;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnAddProductToCart),
                Click.on(btnGoToCart));
    }

    // PENDIENTE IMPLEMENTAR EL MÉTODO PARA HACER LOS CLICKS.
    public static PrepareBuyCheckoutSauce prepareFor() {
        return Tasks.instrumented(PrepareBuyCheckoutSauce.class);
    }
}
