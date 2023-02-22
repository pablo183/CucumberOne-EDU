package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.ParseException;

public class Steps {

    @Given("User on NetBanking loading page")
    public void user_on_net_banking_loading_page() {
        System.out.println("navigated to login url");
    }

    @Given("validate the browser")
    public void validate_the_browser() {
        System.out.println("deciding the browser to open");
    }
    @When("Browser is triggered")
    public void browser_is_triggered() {
        System.out.println("Browser is triggered");
    }
    @Then("check if browser is started")
    public void check_if_browser_is_started() {
        System.out.println("Browser is started");
    }

    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("nLogged in sucess");
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Valdiating home page");
    }
    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        System.out.println("Valdiating cards");
    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password_password(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

}
