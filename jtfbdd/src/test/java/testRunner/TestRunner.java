package testRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"stepDefinitions"},
monochrome = true, 
plugin = {"json:target/cucumber.json/"},
tags = "@actionTest"

		)

public class TestRunner {



}
