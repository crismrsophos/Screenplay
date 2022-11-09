package com.sophossolutions.certification.tasks;


import com.sophossolutions.certification.models.ProductAdvantage;
import com.sophossolutions.certification.models.UserCredential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static com.sophossolutions.certification.userinfaces.AdavantageOnlineBuyHomePage.BTN_CHOOSE_CATEGORY;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyCategoryPage.BTN_CHOOSE_TABLET;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyProductPage.COLOR;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyProductPage.QUANTITY;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyProductPage.BTN_ADD_TO_CART;
import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyProductPage.BTN_CHECKOUT;







public class AdvantageSelectProduct implements Task {

    private String category;
    private Target btnSelectCategory;

    private String product;

    private Target btnSelectArticle;

    private String color;
    private Target btnColor;

    private String quantity;

    private Target btnAddCart;

    private Target btnCheckout;


    public AdvantageSelectProduct(ProductAdvantage products) {
        super();
        category = products.getCategory();
        btnSelectCategory = BTN_CHOOSE_CATEGORY.of(category);
        product = products.getProduct();
        btnSelectArticle = BTN_CHOOSE_TABLET.of(product);
        color=products.getColor();
        btnColor = COLOR.of(color);
        quantity = products.getQuantity();
        btnAddCart = BTN_ADD_TO_CART;
        btnCheckout = BTN_CHECKOUT;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(btnSelectCategory),
               Click.on(btnSelectArticle),
               Click.on(btnColor),
               Hit.the(Keys.BACK_SPACE).into(QUANTITY),
               Enter.theValue(quantity).into(QUANTITY),
               Click.on(btnAddCart),
               Click.on(BTN_CHECKOUT));
    }

   public static AdvantageSelectProduct in(ProductAdvantage products) {
       return Tasks.instrumented(AdvantageSelectProduct.class, products);
    }


}
