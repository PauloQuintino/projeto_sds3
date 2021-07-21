package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/feature/",
        glue = {"steps"},
        tags = "@UnitTest"
)

public class RunnerTest {
}
