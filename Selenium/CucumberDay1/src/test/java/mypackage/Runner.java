package mypackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/text/resources/Logn.feature",glue = "mypackage",
plugin = {"html:target/cucumber-html-report.html"})
public class Runner extends AbstractTestNGCucumberTests {

}
