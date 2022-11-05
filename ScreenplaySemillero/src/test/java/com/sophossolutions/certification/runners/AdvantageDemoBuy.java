package com.sophossolutions.certification.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {
                "com.sophossolutions.certification.stepdefinitions",
                "com.sophossolutions.certification.hooks"
        },
        features = "src/test/resources/features/advantage_demo.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AdvantageDemoBuy {
}
