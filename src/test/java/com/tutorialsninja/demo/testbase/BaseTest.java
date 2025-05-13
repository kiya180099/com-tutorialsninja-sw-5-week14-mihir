package com.tutorialsninja.demo.testbase;


import com.tutorialsninja.demo.utility.Utility;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility implements ITestListener {

    //String browser = PropertyReader.getInstance().getProperty("browser");

    String browser = "chrome";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeBrowser();
    }
}