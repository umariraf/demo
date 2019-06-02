package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/features/Login.feature",
//							"src/test/java/features/NewCustomer.feature",
//							"src/test/java/features/NewAccount.feature",
//							"src/test/java/features/Deposit.feature",
//							"src/test/java/features/Withdrawal.feature",
//							"src/test/java/features/BalanceEnquiry.feature",
//							"src/test/java/features/DeleteAccount.feature"},
//							 
//				 glue = {"stepdefinitions"})
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},
							 
				 glue = {"stepdefinitions"})
	
public class TestRunner {
	
}
