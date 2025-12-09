package Steps;

import LibraryFiles.DriverFactory;
import Pages.SwagLabHomePage;
import Pages.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SwagLabLoginSteps
{
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Given("user is on swagLab login page")
    public void user_is_on_swag_lab_login_page()
    {
        DriverFactory.driver.get("https://www.saucedemo.com/");
    }

    @When("user enter username {string} on swaglab login page")
    public void user_enter_username_on_swaglab_login_page(String UNValue)
    {
        login.inpSwagLabLoginPageUN(UNValue);
    }

    @When("user enter password {string} on swaglab login page")
    public void user_enter_password_on_swaglab_login_page(String PWDValue)
    {
        login.inpSwagLabLoginPagePWD(PWDValue);
    }

    @When("user click on login button on swaglab login page")
    public void user_click_on_login_button_on_swaglab_login_page()
    {
        login.clickSwagLabLoginPageLoginBtn();
    }

    @Then("swag page should be visible with logo text {string}")
    public void swag_page_should_be_visible_with_logo_text(String expLogoText)
    {
        String actLogoText = home.getSwagLabHomePageLogoText();
        Assert.assertEquals(actLogoText,expLogoText,"Failed- act & exp logoText are different");
    }


    @When("wait for {int} second")
    public void wait_for_second(Integer timeInSec) throws InterruptedException
    {
       Thread.sleep(timeInSec*1000);
    }

    @Then("login failed error msg visible")
    public void login_failed_error_msg_visible()
    {
        boolean errorMsgVisibleActualResult = login.getSwagLabLoginPageLoginFailedErrorMsgVisible();
        Assert.assertTrue(errorMsgVisibleActualResult,"Failed- login failed error msg not visible");
    }


}
