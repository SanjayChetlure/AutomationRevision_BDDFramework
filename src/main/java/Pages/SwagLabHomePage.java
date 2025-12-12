package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class SwagLabHomePage
{
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement addToCartBackpack;
    @FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cart;



    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public String getSwagLabHomePageLogoText()
    {
        String actLogoText = logo.getText();
        return actLogoText;
    }




    public void clickSwagLabHomePageAddToCartBackpack()
    {
        addToCartBackpack.click();
    }

    public void clickSwagLabHomePageCart()
    {
        cart.click();
    }

}