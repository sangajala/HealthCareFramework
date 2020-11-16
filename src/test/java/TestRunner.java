import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions
        (
                features = {"src/test/resources/featureFiles/BookingAppointment.feature"},
                glue = {"stepDefs"},
                tags = "@booking",
//                dryRun = true,
                plugin = {"pretty","html:target/report.html"}

        )

@RunWith(Cucumber.class)
public class TestRunner
{

}

