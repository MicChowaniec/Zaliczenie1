package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test { public static void main(String[] args)
{
    System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
    WebDriver driver=new FirefoxDriver(); driver.get("https://www.google.com/");
    driver.manage().window().maximize(); String appTitle=driver.getTitle(); String expTitle="Google";
    if (appTitle.equals (expTitle)){ System.out.println("Verification Successfull"); }
    else{ System.out.println("Verification Failed"); }
    driver.close();
    System.exit(0); }
}