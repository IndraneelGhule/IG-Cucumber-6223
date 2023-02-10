package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on Login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside: user is on Login page");
    }

    @When("user enters Username and Password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside: user enters Username and Password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside: clicks on login button");
    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside: user is navigated to Home Page");

    }
}