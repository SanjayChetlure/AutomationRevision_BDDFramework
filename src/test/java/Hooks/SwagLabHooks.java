package Hooks;

import LibraryFiles.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class SwagLabHooks
{

    @Before
    public void openBrowser() throws IOException
    {
        DriverFactory.initializeBrowser("edge");
    }

    @After
    public void closeBrowser()
    {
        DriverFactory.driver.quit();
    }

}
