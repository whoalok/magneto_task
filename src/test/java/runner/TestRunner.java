package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(	
    features = "src/test/java/feature/profile_mgmt.feature",
    glue = {"stepDefinition","Hooks"},
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)

public class TestRunner{

}
