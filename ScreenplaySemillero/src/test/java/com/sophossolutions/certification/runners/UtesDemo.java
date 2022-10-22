package com.sophossolutions.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { 
        		"com.sophossolutions.certification.stepdefinitions",
        		"com.sophossolutions.certification.hooks"
        },
        features = "src/test/resources/features/utest_register_user.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class UtesDemo {

}
