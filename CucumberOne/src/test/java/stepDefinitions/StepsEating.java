package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepsEating {
    private int startCucumbers;
    private int eatenCucumbers;
    private int expectedLeftCucumbers;

    @Given("There are {int} cucumbers")
    public void there_are_cucumbers(int start) {
        startCucumbers = start;
    }

    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(int eat) {
        eatenCucumbers += eat;
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(int left) {
        expectedLeftCucumbers = left;
        int actualLeftCucumbers = startCucumbers - eatenCucumbers;
        assertEquals(expectedLeftCucumbers, actualLeftCucumbers);
    }

}
