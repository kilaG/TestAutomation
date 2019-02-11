package br.com.guilherme;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/SimularInvestimentoPoupanca.feature", format = ("json:target/demoQATest.json"),
glue = { "" }, monochrome = true, dryRun = false)

public class demoQATest {
	
	

}
