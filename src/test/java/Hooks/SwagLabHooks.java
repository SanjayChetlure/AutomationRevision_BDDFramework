package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class SwagLabHooks
{

    @Before
    public void openBrowser() throws IOException
    {
        DriverFactory.initializeBrowser("edge");
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
