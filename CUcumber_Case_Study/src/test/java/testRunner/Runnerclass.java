package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile", glue = { "Stepdefinition" }, tags = "@login",plugin = {"preety","jason;target/cucumber.jason"})

public class Runnerclass {

}
