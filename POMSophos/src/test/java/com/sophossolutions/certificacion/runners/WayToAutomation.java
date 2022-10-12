package com.sophossolutions.certificacion.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.sophossolutions.certificacion.stepdefinitions",
                "com.sophossolutions.certificacion.hooks"},
        features = "src/test/resources/features/way_to_automation.feature",

        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class WayToAutomation {
}
