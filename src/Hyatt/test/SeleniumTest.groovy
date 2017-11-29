package Hyatt.test
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium1 {
    public static void main(String[] args){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://magenicautomation.azurewebsites.net/");
        WebElement contact=driver.findElement(By.cssSelector("li[id='ContactButton']"));
        contact.click();
    }
}