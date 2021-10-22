package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class Task2Test {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement SignInButton = driver.findElement(By.cssSelector("span.hidden-sm-down"));
        SignInButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement LoginField = driver.findElement(By.cssSelector("input.form-control"));
        LoginField.sendKeys("fkfstiucsgasugjlrq@sdvgeft.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys("tester123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement SignIn2 = driver.findElement(By.id("submit-login"));
        SignIn2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Main = driver.findElement(By.xpath("//*[@id=\"_desktop_logo\"]/a/img"));
        Main.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement FindBird = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[2]/div/a/img"));
        FindBird.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement size = driver.findElement(By.id("group_1"));
        size.sendKeys("m");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
        quantity.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        quantity.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        quantity.sendKeys("5");

        WebElement button1 = driver.findElement(By.cssSelector("button.btn.btn-primary.add-to-cart"));
        button1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button2 = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        button2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        button3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button4 = driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button"));
        button4.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button5 = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        button5.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement radio1 = driver.findElement(By.id("payment-option-1"));
        radio1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement check1 = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        check1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement confirm = driver.findElement(By.cssSelector("button.btn.btn-primary.center-block"));
        confirm.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        takeSnapShot(driver, "screenshot//screenshot.png");
        }
    public static void takeSnapShot(WebDriver driver, String filePath) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestinationFile = new File(filePath);
        FileUtils.copyFile(SrcFile, DestinationFile);
    }












        // zrobi screenshot z potwierdzeniem zamówienia i kwotą.



}