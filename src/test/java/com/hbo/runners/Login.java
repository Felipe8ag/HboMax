package com.hbo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/hbo/stepdefinitions",
        features = "src/test/resources/com.hbo.feature/login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Login {
}
