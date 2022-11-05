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
        features = "src/test/resources/features/demo_qa.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DemoQa {
}
