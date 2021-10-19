package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2Steps
{
    public WebDriver driver;

    public void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver;
    }

    @Given("Log in")
    public void LogIn() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("Pick Hummingbird Printed Swater")
    public void PHPS(){
        WebElement FindBird = driver.findElement(By.className("h3 product-title"));
        FindBird.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Given("Pick M size")
    public void PickMSize() {
        WebElement size = driver.findElement(By.id("group_1"));
        size.sendKeys("m");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("Pick 5 pieces")
    public void Pick5Pieces() {
        WebElement quantity = driver.findElement(By.className("quantity_wanted"));
        quantity.sendKeys("5");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("Add articles to basket")
    public void Addatob()
    {
        WebElement button1 = driver.findElement(By.cssSelector("button.btn btn-primary add-to-cart"));
        button1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement button2 = driver.findElement(By.className("\"btn btn-primary\""));
        button2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("Adress confirmation")
    public void AdressCon(){}

    @Given("Choose \"pick up in store\"")
    public void Choose(){}

    @Given("Order with obligation to pay")
    public void Order(){}

    @Then("Make a screenshot with purchase and value")
    public void MakeAScreenShot(){}

}
