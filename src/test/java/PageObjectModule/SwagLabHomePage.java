package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 2
public class SwagLabHomePage {

   @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;


    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public String getSwagLabHomePageLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }

}
