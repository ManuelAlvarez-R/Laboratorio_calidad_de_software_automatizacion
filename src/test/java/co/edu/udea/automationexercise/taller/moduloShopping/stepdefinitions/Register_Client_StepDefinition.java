package co.edu.udea.automationexercise.taller.moduloShopping.stepdefinitions;
import co.edu.udea.automationexercise.taller.moduloShopping.tasks.OpenThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Register_Client_StepDefinition {

    public final Actor Buyer = Actor.named("Jane");
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver BrowsingDriver;

    @Before
    public void config(){
        Buyer.can(BrowseTheWeb.with(BrowsingDriver));
    }

    // Scenario: Arriving at the store
    @Given("I am a new user")
    public void iAmANewUser() {
        Buyer.attemptsTo(OpenThe.Browser());
    }

    @When("I open the Automation Exercise store")
    public void iOpenTheAutomationExerciseStore() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see the home page")
    public void iSeeTheHomePage() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see the option to sign up")
    public void iSeeTheOptionToSignUp() {
        throw new io.cucumber.java.PendingException();
    }


    // Scenario Outline: Successful registration
    @Given("I am a new user on the store home page")
    public void iAmANewUserOnTheStore() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I register {string} with email {string}")
    public void iRegisterWithEmail(String arg0, String arg1) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see the successful registration message")
    public void iSeeTheSuccessfulRegistrationMessage() {
        throw new io.cucumber.java.PendingException();
    }


    //Registration with an email address that already exists
    @Given("I am a user on the store home page")
    public void iAmAUserOnTheStoreHome() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I register my details using an email address that is already registered")
    public void iRegisterMyDetailsUsingAnEmailAddress() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see the message that the email address already exists")
    public void iSeeTheMessageThatTheEmailAddress() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I am not registered")
    public void iAmNotRegistered() {
        throw new io.cucumber.java.PendingException();
    }


}
