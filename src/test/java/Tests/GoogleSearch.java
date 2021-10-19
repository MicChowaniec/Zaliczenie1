package taskCheckConfig;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class GoogleSearch {


    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver32.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element3 = driver.findElement(By.name("q"));
        element3.clear();
        element3.sendKeys("Coderslab");
        element3.submit();
        driver.quit();
    }

}