package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 4000;
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.clickViaJs = false;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://app.qase.io";
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if(getWebDriver() != null);
            getWebDriver().quit();
    }
}
