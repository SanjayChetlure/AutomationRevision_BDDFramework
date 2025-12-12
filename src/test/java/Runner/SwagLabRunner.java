package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\AutomationRevision_BDDFramework\\src\\test\\java\\Features\\REx3_E2EScenarioOutline.feature",
        glue = {"Hooks","Steps"},
//        tags = "@regression",
        publish = true,
        plugin = {"pretty","html:target/cucumber-reports/SwagLabsProductReports.html"}
)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{

}
