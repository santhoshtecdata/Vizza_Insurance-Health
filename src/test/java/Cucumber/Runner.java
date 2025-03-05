package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/featureFiles/policy.feature",glue="stepDifinitions")
             

public class Runner {
	
           }


