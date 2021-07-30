package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resource/Feaures/Login.feature", glue = {"StepDefinitions"})

public class Test_Runner {
	
	
}