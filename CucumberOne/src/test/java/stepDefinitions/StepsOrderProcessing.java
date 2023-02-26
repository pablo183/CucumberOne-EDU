package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepsOrderProcessing {
    private String product;
    private int quantity;
    private String status;

    @Given("^I have a \"([^\"]*)\"$")
    public void i_have_a(String product) {
        this.product = product;
    }

    @When("^I place an order for (\\d+) items$")
    public void i_place_an_order_for_items(int quantity) {
        this.quantity = quantity;

    }

    @Then("^the order should be \"([^\"]*)\"$")
    public void the_order_should_be(String status) {
        this.status = status;

    }

}
