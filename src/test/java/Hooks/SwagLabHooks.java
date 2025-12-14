package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import Runner.SwagLabCTParallelExecutionRunner;
import Runner.SwagLabRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class SwagLabHooks extends DriverFactory
{

    @Before
    public void openBrowser() throws IOException
    {
        //get browserName from TestSuite (TestSuite->RunnerClass->Hooks)
        String browser = SwagLabCTParallelExecutionRunner.browserName;

        // get browserName from PropertyFile if browserName is empty in testSuite
        if (browser == null) {
            browser = UtilityClass.getPFData("browserName");
        }
        initializeBrowser(browser);
    }

    @After
    public void closeBrowser(Scenario sce) throws IOException {
        if (sce.isFailed())
        {
            UtilityClass.captureSS(sce);
        }

        DriverFactory.driver.quit();
    }

}
