package com.sophossolutions.certification.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DemoQaStepDefinitions {
    @Given("{string} desea navegar en la siguiente https:\\/\\/www.advantageonlineshopping.com\\/#\\/")
    public void deseaNavegarEnLaSiguienteHttpsWwwAdvantageonlineshoppingCom(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Ingresa los siguientes datos de usuario")
    public void ingresaLosSiguientesDatosDeUsuario(io.cucumber.datatable.DataTable dataTable) {
    }
}
