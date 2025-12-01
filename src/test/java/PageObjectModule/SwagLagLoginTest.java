package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SwagLagLoginTest
{
    public static void main(String[] args)
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.inpSwagLabLoginPageUN("standard_user");
        login.inpSwagLabLoginPagePWD("secret_sauce");
        login.clickSwagLabLoginPageLoginBtn();

        SwagLabHomePage home=new SwagLabHomePage(driver);
        String actLogoText = home.getSwagLabHomePageLogoText();
        String expLogoText="Swag Labs";

        if (actLogoText.equalsIgnoreCase(expLogoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fail");
        }

        driver.quit();
    }
}
