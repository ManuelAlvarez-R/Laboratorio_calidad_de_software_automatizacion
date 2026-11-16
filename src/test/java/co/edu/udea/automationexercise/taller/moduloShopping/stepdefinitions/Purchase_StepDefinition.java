package co.edu.udea.automationexercise.taller.moduloShopping.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Purchase_StepDefinition {
    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }


    //Scenario outline: Adding a product to the cart
    @Given("I am a customer who has already entered the store")
    public void iAmACustomerWhoHasAlreadyEntered() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String arg0) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} is in the shopping cart")
    public void isInTheShoppingCart(String product) {
        throw new io.cucumber.java.PendingException();
    }


    //Scenario: Confirming the purchase order

    @Given("I have a product in the shopping cart")
    public void iHaveAProductInTheShoppingCart() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I complete the purchase details and confirm the order")
    public void iCompleteThePurchaseDetailsAndConfirmThe() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see the message that the order has been placed")
    public void iSeeTheMessageThatTheOrderHas() {
        throw new io.cucumber.java.PendingException();
    }

    //Scenario Outline: Removing a product from the cart

    @Given("I have {string} in the shopping cart")
    public void iHaveInTheShoppingCart(String arg0) {
        throw new io.cucumber.java.PendingException();
    }

    @When("I remove {string} from the cart")
    public void iRemoveFromTheCart(String arg0) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("the cart no longer contains {string}")
    public void theCartNoLongerContains(String product) {
        throw new io.cucumber.java.PendingException();
    }
}
