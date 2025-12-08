package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Sample1Hooks
{
    @Before
    public void login()
    {
        System.out.println("---login to app---");
    }


    @After
    public void logout()
    {
        System.out.println("---logout from app---");
    }

    @BeforeAll
    public static void openBrowser()
    {
        System.out.println("---open browser---");
    }

    @AfterAll
    public static void closeBrowser()
    {
        System.out.println("---close browser---");
    }


}
