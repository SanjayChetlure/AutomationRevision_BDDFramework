package Runner;

import io.cucumber.core.backend.Glue;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"C:\\Users\\sanja\\IdeaProjects\\AutomationRevision_BDDFramework\\src\\test\\java\\Features\\Ex6_Hooks.feature",""},
//        features = "C:\\Users\\sanja\\IdeaProjects\\AutomationRevision_BDDFramework\\src\\test\\java\\Features",
//        tags = "@smoke and @regression",
//        tags = "@smoke or @performance",
//        tags = "not @performance",
        tags = "@abc",
        glue = {"Steps","Hooks"}       //provide only step definition class package name
)
public class SampleRunner extends AbstractTestNGCucumberTests
{


}
