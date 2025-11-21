package mainpackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/CIITStudentFeature.feature"},glue = "mypackage",
plugin = {"pretty","html:target/CucumberReport.html"})
public class Runner extends AbstractTestNGCucumberTests {

}

