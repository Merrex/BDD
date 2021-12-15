package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"C://Users//Mayur Kumar//Desktop//Assignment_01//SeleniumBDD//AppFeatures//gmail.feature"},
				glue={"stepDefinition"},
						plugin= {"pretty","html:target/HtmlReports","junit:target/junitFolder/junitReports.xml",
								"json:target/JSONFolder/JSONReports.json"}
				)

public class TestRunner {
	
	
}
