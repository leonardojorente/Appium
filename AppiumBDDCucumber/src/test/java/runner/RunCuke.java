package runner;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"json:target/cucumber.json", "pretty", "html:target/cucumber","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        ,features = {"src/test/java/features"}
        ,glue={"steps"}
        //,monochrome=true
        ,tags={"@Register-User--UserStory01,@Create-User-Positive--AcceptanceCriteria01"}


)
public class RunCuke {
    @BeforeClass
    public static void setup() {

        ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/java/extent-config.xml"));
        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v49.0.1");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

    }

}

