package com.sophossolutions.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.certificacion.stepdefinitions",
        features = "src/test/resources/features/automation_practice.feature",

        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class AutomationPractice {
}
