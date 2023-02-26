package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.alktom.example.IsItFriday;
import org.junit.Assert;

public class StepsIsItFriday {
    private String today;
    private String actualAnswer;

    @Given("^Today is \"([^\"]*)\"$")
    public void today_is(String day) {
        today = day;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

}
