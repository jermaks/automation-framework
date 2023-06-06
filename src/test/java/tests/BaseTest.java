package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.SearchSteps;
import utils.DriverFactory;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static WebDriver driver;

    SearchSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); //implicit wait.
        driver.get(PropertyReader.getUrl());
        steps = new SearchSteps();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void goBack() {
        driver.navigate().back();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }


    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium java"}/*, {"selenium javascript"}*/};
    }

}
