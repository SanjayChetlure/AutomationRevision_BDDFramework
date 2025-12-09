package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//pom class 1
public class SwagLabLoginPage {

    //Step1; declaration
    @FindBy(xpath = "//input[@id='user-name']") private WebElement UN ;    //private WebElement UN=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@id='password']")  private WebElement PWD;
    @FindBy(xpath = "//input[@id='login-button']")  private WebElement loginBtn;
    @FindBy(xpath = "//h3[contains(text(),'Username and password do not match')]") private  WebElement loginFailedErrorMsg;

    //step2: initialization
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //step3: usage
    public void inpSwagLabLoginPageUN(String username)
    {
        UN.sendKeys(username);
    }

    public void inpSwagLabLoginPagePWD(String password)
    {
        PWD.sendKeys(password);
    }

    public void clickSwagLabLoginPageLoginBtn()
    {
        loginBtn.click();
    }

    public boolean getSwagLabLoginPageLoginFailedErrorMsgVisible()
    {
        boolean result=false;
        try
        {
            result=loginFailedErrorMsg.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Element not found");
        }
        return result;
    }

}
