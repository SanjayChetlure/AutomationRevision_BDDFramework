package Question_Ans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Sample5_webtable.html");

        String text = driver.findElement(By.xpath("//table[@id='1234']//td[text()='300']//parent::tr/td[2]")).getText();
        System.out.println(text);
    }
}
