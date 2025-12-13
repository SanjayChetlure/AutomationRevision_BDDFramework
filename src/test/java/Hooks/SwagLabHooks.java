package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class SwagLabHooks extends DriverFactory
{

    @Before
    public void openBrowser() throws IOException
    {
        String browser = UtilityClass.getPFData("browserName");
//        DriverFactory.initializeBrowser(browser);
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
