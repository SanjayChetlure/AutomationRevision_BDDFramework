package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample_Steps
{
    @Given("user is on login page")
    public void user_is_on_login_page()
    {
        System.out.println("login page");
    }
    @When("user enter valid username")
    public void user_enter_valid_username() {
        System.out.println("enter username");
    }
    @When("user enter valid password")
    public void user_enter_valid_password() {
        System.out.println("enter password");
    }
    @When("user click on login btn")
    public void user_click_on_login_btn() {
        System.out.println("click on login btn");
    }
    @Then("home should be visible")
    public void home_should_be_visible() {
        System.out.println("home page visible");
    }

    @When("user enter invalid password")
    public void user_enter_invalid_password() {
        System.out.println("entered wrong pwd");
    }
    @Then("login failed message should be visible")
    public void login_failed_message_should_be_visible() {
        System.out.println("login failed error msg visible");
    }

}
