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

public class Task1Steps {
    public WebDriver driver;

    public void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver;
    }

    @Given("^user opens page$")
    public void user_opens_page() throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Otwiera się witryna
        throw new PendingException();
    }

    @And("user clicks on button")
    public void userClicksButton() {
        WebElement SignInButton = driver.findElement(By.cssSelector("span.hidden-sm-down"));
        SignInButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And(" user enters email (.*)")
    public void userEntersEmail(String email) {
        WebElement LoginField = driver.findElement(By.cssSelector("type.email"));
        LoginField.sendKeys(email);
    }

    @And("user enters password(. *)")
    public void userEntersPassword(String password) {
        WebElement PasswordField = driver.findElement(By.cssSelector("type.password"));
        PasswordField.sendKeys(password);
    }


    @And("user clicks button")
    public void userClicksButton2() {
        WebElement SignIn2 = driver.findElement(By.id("submit-login"));
        SignIn2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("user clicksuser clicks \"add a new address\" button")
    public void UserClicksNewAdress() {
        WebElement SignIn2 = driver.findElement(By.id("submit-login"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @And(" user adds new alias (.*), address (.*), zip code (.*)," +
            " city (.*), country (.*), and phone (.*)")
    public void fillForm(String alias,
                         String address, String code, String city, String country,
                         String phone)
    {
        WebElement ealias = driver.findElement(By.name("alias"));
        ealias.sendKeys(alias);
        WebElement eadress = driver.findElement(By.name("adress1"));
        ealias.sendKeys(address);
        WebElement ecode = driver.findElement(By.name("postcode"));
        ealias.sendKeys(code);
        WebElement ecity = driver.findElement(By.name("city"));
        ealias.sendKeys(city);
        WebElement ecountry = driver.findElement(By.name("id_country"));
        ealias.sendKeys(country);
        WebElement ephone = driver.findElement(By.name("tel"));
        ealias.sendKeys(phone);

    }
    @And("clics save button")
    public void clicsSave()
    {
        WebElement saveBut = driver.findElement(By.cssSelector("button.btn btn-primary float-xs-right"));
        saveBut.click();
    }
    @Then("user sees confirmation message")
    public boolean checking() {

        WebElement text = driver.findElement(By.cssSelector("article.Address successfully added!"));
        if (text.isSelected())
        return true;
    }
    @And("browser is closed")
    public void closing()
    {
        driver.quit();
    }
}



