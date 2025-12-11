package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import Pages.SwagLabHomePage;
import Pages.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabLoginSteps
{
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Given("user is on swagLab login page")
    public void user_is_on_swag_lab_login_page() throws IOException {
        String urlValue = UtilityClass.getPFData("URL");
        DriverFactory.driver.get(urlValue);
    }

    @When("user enter username {string} on swaglab login page")
    public void user_enter_username_on_swaglab_login_page(String UNKey) throws IOException {
        String UVValue = UtilityClass.getPFData(UNKey);
        login.inpSwagLabLoginPageUN(UVValue);
    }

    @When("user enter password {string} on swaglab login page")
    public void user_enter_password_on_swaglab_login_page(String pwdKey) throws IOException {
        String pwdValue = UtilityClass.getPFData(pwdKey);
        login.inpSwagLabLoginPagePWD(pwdValue);
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
