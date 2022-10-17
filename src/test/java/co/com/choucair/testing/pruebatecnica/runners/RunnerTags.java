package co.com.choucair.testing.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import  net.serenitybdd.cucumber.CucumberWithSerenity;
import  org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/UtestRegister.feature",
        tags = "@stories",
        glue = "co.com.choucair.testing.pruebatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}