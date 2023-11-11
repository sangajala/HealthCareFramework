import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions
        (
                features = {"src/test/resources/featureFiles/Login.feature"},
                glue = {"stepDefs"},
                tags = "@bark",
//                dryRun = true,
                plugin = {"pretty","html:target/report.html"}

        )

@RunWith(Cucumber.class)
public class TestRunner
{

}

