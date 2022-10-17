package co.com.choucair.testing.pruebatecnica.stepdefinitions;

import co.com.choucair.testing.pruebatecnica.tasks.OpenUp;
import co.com.choucair.testing.pruebatecnica.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Kevin wants to create an account on the Utest platform$")
    public void thatKevinWantsToCreateAnAccountOnTheUtestPlatform() {
        OnStage.theActorCalled("Kevin").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));

    }


    @When("^he search the registration form for Utest users$")
    public void heSearchTheRegistrationFormForUtestUsers() {

    }

    @Then("^he is successfully registered on the Utest platform$")
    public void heIsSuccessfullyRegisteredOnTheUtestPlatform() {

    }

}
