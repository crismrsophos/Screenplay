package com.sophossolutions.certificacion.stepdefinitions;

import java.util.List;

import com.sophossolutions.certificacion.models.TShirt;
import com.sophossolutions.certificacion.models.newUserWay2Automation;
import com.sophossolutions.certificacion.pages.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WayToAutomationStepDefinitions {

    WayToAutomationHomePage homePage;
    WayToAutomationRegisterPage registerPage;


    @When("Ubicarme en la sección de registro e ingresar")
    public void ubicarmeEnLaSecciónDeRegistroEIngresar(newUserWay2Automation data) {

        homePage.goToSection();
        registerPage.setInformationAndSubmit(data);



        //dataTable.asList().get() parámetro -> io.cucumber.datatable.DataTable dataTable
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Then("Valido que el mensaje sea {string}")
    public void validoQueElMensajeSea(String message) {

        registerPage.validateText(message);

    }
}
