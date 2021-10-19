package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/Cucumber/features",
        glue = {"steps"},
        plugin = {"pretty","html:out"})

public class Task1StepsTest
{

}