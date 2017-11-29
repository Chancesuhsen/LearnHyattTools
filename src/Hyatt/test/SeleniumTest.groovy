package Hyatt.test

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium1 {
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver",C:\\Users\\kday\\Desktop\\Selenium Stuff\\chromedriver.exe");
        //FirefoxDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\HyattTest\\LearnHyattTools\\driver\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://magenicautomation.azurewebsites.net/");
        WebElement contact=driver.findElement(By.cssSelector("li[id='ContactButton']"));
        contact.click();
        driver.sleep(5000);
        driver.close();
    }
}