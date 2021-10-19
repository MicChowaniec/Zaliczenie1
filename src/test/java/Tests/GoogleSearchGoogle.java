package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class GoogleSearchGoogle {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.google.com");
//czekaj 5 sekund
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.id("L2AGLb"));
        element2.click();
        WebElement element3 = driver.findElement(By.name("q"));
        element3.clear();
        element3.sendKeys("Coderslab");
        element3.submit();
        driver.quit();
    }

}