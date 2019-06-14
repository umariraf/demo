package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/features/NewAccount.feature"
//							},
//							 
//				 glue = {"stepdefinitions"})
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, glue = { "stepdefinitions" }, plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml"})

public class TestRunner {

}
