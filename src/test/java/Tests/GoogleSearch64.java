package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearch64 {


    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver64.exe");
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