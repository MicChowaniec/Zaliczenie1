package steps;




import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Task1Steps {
    private WebDriver driver;
    public void main(String[] args) {    };

    public void takeDriver(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Given("^user opens page$")
    public void user_opens_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        takeDriver(driver);
    }

    @And("^user clicks on button$")
    public void userClicksButton() throws Throwable{

        WebElement SignInButton = driver.findElement(By.cssSelector("span.hidden-sm-down"));
        SignInButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^user enters email (.*)$")
    public void userEntersEmail(String email) throws Throwable{
        WebElement LoginField = driver.findElement(By.cssSelector("input.form-control"));
        LoginField.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^user enters password (.*)$")
    public void userEntersPassword(String password) throws Throwable{
        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Given("^click Sign in button.$")
    public void userClicksButton2() throws Throwable{
        WebElement SignIn2 = driver.findElement(By.id("submit-login"));
        SignIn2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^user clicks add a new address button$")
    public void UserClicksNewAddress() throws Throwable{
        WebElement SignIn2 = driver.findElement(By.id("address-link"));
        SignIn2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @And("^user adds new alias (.*), address (.*), zip code (.*), city (.*), country (.*) and phone (.*)$")
    public void fillForm(String alias,
                         String address, String code, String city, String country,
                         String phone) throws Throwable {
        WebElement ealias = driver.findElement(By.name("alias"));
        ealias.sendKeys(alias);
        WebElement eadress = driver.findElement(By.name("address1"));
        eadress.sendKeys(address);
        WebElement ecode = driver.findElement(By.name("postcode"));
        ecode.sendKeys(code);
        WebElement ecity = driver.findElement(By.name("city"));
        ecity.sendKeys(city);
        WebElement ecountry = driver.findElement(By.name("id_country"));
        ecountry.sendKeys(country);
        WebElement ephone = driver.findElement(By.name("phone"));
        ephone.sendKeys(phone);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Given("^clics save button$")
    public void clicsSave() throws Throwable
    {
        WebElement saveBut = driver.findElement(By.cssSelector("button.btn.btn-primary.float-xs-right"));
        saveBut.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("^user sees confirmation message$")
    public void checking() {

        WebElement text = driver.findElement(By.cssSelector("li"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @And("^browser is closed$")
    public void closing()
    {
        driver.quit();
    }
}



