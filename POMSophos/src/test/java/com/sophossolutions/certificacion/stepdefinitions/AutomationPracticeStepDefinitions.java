package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.AutomationPracticeFadedShortSleeveTshirtsPage;
import com.sophossolutions.certificacion.pages.AutomationPracticeHomePage;
import com.sophossolutions.certificacion.pages.AutomationPracticeTshirtsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AutomationPracticeStepDefinitions {

    AutomationPracticeHomePage homePage;
    AutomationPracticeTshirtsPage tshirtsPage;
    AutomationPracticeFadedShortSleeveTshirtsPage fadedShortSleeveTshirtsPage;

    @When("Ingreso a la sección de T-Shirts")
    public void ingresoALaSecciónDeTShirts() {
        homePage.clicOnTshirts();
    }
    @When("Selecciono la camiseta azul")
    public void seleccionoLaCamisetaAzul() {
        tshirtsPage.clicOnBlueTshirt();
    }

    @When("Ingreso cantidad y talla {string} y {string}")
    public void ingresoCantidadYTallaY(String quantity, String size) {
        fadedShortSleeveTshirtsPage.setQuantity(quantity);
        fadedShortSleeveTshirtsPage.setSize(size);
    }

    @When("Agrego la camiseta al carro de compras")
    public void agregoLaCamisetaAlCarroDeCompras() {
        fadedShortSleeveTshirtsPage.clicOnAddToCart();
    }
    @When("Procedo a hacer checkout")
    public void procedoAHacerCheckout() {
        fadedShortSleeveTshirtsPage.clicOnProceedToCheckout();

    }
    @When("Inicio sesion {string} y {string}")
    public void inicioSesionConLosDatosY() {
        //PENDIENTE MAPEAR CAMPOS CUANDO LA PÁGINA FUNCIONE
    }
    @When("Acepto los términos de servicio")
    public void aceptoLosTérminosDeServicio() {

    }
    @Then("Valido que el cálculo del valor unitario multiplicado por la cantidad, más los impuestos, más el envío, sea igual al valor total mostrado por la página")
    public void validoQueElCálculoDelValorUnitarioMultiplicadoPorLaCantidadMásLosImpuestosMásElEnvíoSeaIgualAlValorTotalMostradoPorLaPágina() {

    }
}
