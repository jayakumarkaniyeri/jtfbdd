package testRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/PracticePage.feature", glue = {"stepDefinitions"},
monochrome = true, 
plugin = {"json:target/cucumber.json/"},
tags = "@tableTest"


		)

public class TestRunner {



}
