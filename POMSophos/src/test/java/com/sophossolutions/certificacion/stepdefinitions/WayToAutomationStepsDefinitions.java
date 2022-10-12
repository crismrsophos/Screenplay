package com.sophossolutions.certificacion.stepdefinitions;

import java.util.List;

import com.sophossolutions.certificacion.models.Registration;
import com.sophossolutions.certificacion.pages.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WayToAutomationStepsDefinitions {

    WayToAutomationHomePage home;
    WayValidation registrator;

    @When("Registro usuario con los siguientes datos")
    public void registroUsuarioConLosSiguientesDatos(Registration datatable) {
        home.clickHome();
        registrator.registrateUser(datatable.getName(), datatable.getPhone(), datatable.getEmail(),
                datatable.getCountry(), datatable.getCity(), datatable.getUser(), datatable.getPassword());
    }


}
