package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pl.alktom.example.Shipping;

public class StepsShippingBook {
    private String bookFormat;
    private String bookShipped;

    @Given("^A \"([^\"]*)\" book in Paul's cart$")
    public void a_book_in_Paul_s_cart(String format) {
        bookFormat = format;
    }

    @When("^He pays for it$")
    public void he_pays_for_it() {
        bookShipped = Shipping.shipBook(bookFormat);
    }

    @Then("^The book should be \"([^\"]*)\"$")
    public void the_book_should_be(String shipped) {
        Assert.assertEquals(shipped, bookShipped);
    }
}
