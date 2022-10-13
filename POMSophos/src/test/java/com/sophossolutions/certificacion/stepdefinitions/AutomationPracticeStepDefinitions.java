package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.models.TShirt;
import com.sophossolutions.certificacion.pages.AutomationIndexPage;
import com.sophossolutions.certificacion.pages.AutomationProductPage;
import com.sophossolutions.certificacion.pages.AutomationSelectionPage;
import com.sophossolutions.certificacion.pages.AutomationShoppingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPracticeStepDefinitions {

    AutomationIndexPage indexPage;
    AutomationProductPage productPage;
    AutomationSelectionPage selectionPage;
    AutomationShoppingPage shoppingPage;

    @When("Escojo el producto con las siguientes caracteristicas")
    public void diligencio_los_campos_con_los_datos(TShirt data) {
        indexPage.clicTshirt();
        productPage.clicColor(data.getDescription());
        selectionPage.theTShirt(data.getQuantity(), data.getSize());

    }
    @When("Inicio sesión con los datos del usuario {string} y {string} en {string}")
    public void inicioSesionConLosDatosY(String user, String password, String app) {
        shoppingPage.shippingTShirt(user, password, app);
    }
    @Then("Se muestra la respuesta {string}")
    public void se_muestra_el_mensaje(String total) {
        shoppingPage.comparison(total);

    }

}