package Question_Ans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowEelemnt {
    public static void main(String[] args) {
        System.out.println("code added");

        WebDriver driver=new ChromeDriver();
        driver.get("");

        driver.findElement(By.xpath("ShadowParent Xpath")).getShadowRoot().findElement(By.cssSelector("")).getText();
    }
}
