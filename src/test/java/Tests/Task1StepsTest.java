package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/Cucumber/features/Task1.feature"},
        glue = {"steps"},
        plugin = {"pretty","html:out"},
        dryRun=false)

public class Task1StepsTest
{

}