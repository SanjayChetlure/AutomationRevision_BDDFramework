package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\AutomationRevision_BDDFramework\\src\\test\\java\\Features\\Rex1_loginToSwagLab.feature",
        glue = {"Hooks","Steps"},
//        tags = "@regression",
        publish = true,
        plugin = {"pretty","html:target/cucumber-reports/SwagLabsProductReports.html"}
)

public class SwagLabCTParallelExecutionRunner extends AbstractTestNGCucumberTests
{

    public static String browserName;

    @Parameters("browserName")
    @BeforeClass
    public void setBrowser(String browser) {
        browserName = browser;
    }

}
