package com.hbo.stepdefinitions;

import com.HBO.tasks.SignIn;
import com.HBO.userinterfaces.PopUpPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} want to navigate to {string}")
    public void deseaNavegarALaPagina(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
        theActorCalled(actor).attemptsTo(Click.on(PopUpPage.BTN_ACEPTAR));
    }
    @When("I can do a Login with credentials {string} and password {string}")
    public void iCanDoALoginWithCredentialsAndPassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(SignIn.with(user,password));
    }


}
