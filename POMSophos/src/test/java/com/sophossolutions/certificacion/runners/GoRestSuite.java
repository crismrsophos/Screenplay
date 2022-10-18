package com.sophossolutions.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.certificacion.stepdefinitions",
        features = "src/test/resources/features/go_rest_suite.feature",

        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class GoRestSuite {
}