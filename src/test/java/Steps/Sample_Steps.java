package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

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

    @When("user enter username as {string}")
    public void user_enter_username_as(String UN)
    {
        System.out.println("enter username: "+UN);
    }
    @When("user enter password as {string}")
    public void user_enter_password_as(String pwd)
    {
        System.out.println("entered pwd: "+pwd);
    }

    @When("user enter pin as {int}")
    public void user_enter_pin_as(Integer pin) {
        System.out.println("entered pin: "+pin);
    }

    @Then("home should be visible with {string} logo text")
    public void home_should_be_visible_with_logo_text(String string)
    {
        System.out.println("logo text: "+string);
    }

    @Given("user should be at account opening page")
    public void user_should_be_at_account_opening_page() {
        System.out.println("user is on acc opening page");
    }

    @When("user enters following data")
    public void user_enters_following_data(DataTable dt)
    {

        List<Map<String, String>> data = dt.asMaps();
        System.out.println(data.get(0).get("FN"));
        System.out.println(data.get(0).get("LN"));
        System.out.println(data.get(0).get("Mail ID"));
        System.out.println(data.get(0).get("Mob Num"));
        System.out.println("---");
        System.out.println(data.get(1).get("FN"));
        System.out.println(data.get(1).get("LN"));
        System.out.println(data.get(1).get("Mail ID"));
        System.out.println(data.get(1).get("Mob Num"));
        System.out.println("---");
        System.out.println(data.get(2).get("FN"));
        System.out.println(data.get(2).get("LN"));
        System.out.println(data.get(2).get("Mail ID"));
        System.out.println(data.get(2).get("Mob Num"));
    }

    @When("user click on submit btn")
    public void user_click_on_submit_btn() {
        System.out.println("use click on submit btb");
    }

    @Then("user get created")
    public void user_get_created() {
        System.out.println("user created");
    }



}
