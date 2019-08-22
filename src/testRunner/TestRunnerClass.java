package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\RequirementFile.feature",glue="stepDefinationPkg")
public class TestRunnerClass {


}
