import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs"})
//        format = {
//                "pretty",
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt"
//        })
public class TestRunner extends AbstractTestNGCucumberTests {
//    private TestNGCucumberRunner testNGCucumberRunner;


}