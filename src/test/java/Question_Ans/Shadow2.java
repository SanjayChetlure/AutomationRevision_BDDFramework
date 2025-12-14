package Question_Ans;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow2
{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/explore?q=");

//        driver.findElement(By.cssSelector("input#input")).sendKeys("Selenium Shadow DOM");
//        driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Selenium Shadow DOM");

        driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot().findElement(By.cssSelector("input#input")).sendKeys("abc");





    }
}
