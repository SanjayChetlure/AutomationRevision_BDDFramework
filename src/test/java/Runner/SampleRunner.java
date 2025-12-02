package Runner;

import io.cucumber.core.backend.Glue;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\AutomationRevision_BDDFramework\\src\\test\\java\\Features\\Ex1_LoginToApp.feature",
        glue = "Steps"       //provide only step definition class package name
)
public class SampleRunner extends AbstractTestNGCucumberTests
{

}
