package env;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import configs.WebDriverConfig;
import helpers.AttachmentsHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

/** Main class for initialization browser, set configurations, kill browser **/
public class Base_Container {
    static public WebDriver driver;
    static final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @BeforeTest
    public void setups(){
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        getConfiguration(config.getRunType());
       // driver = Selenide.webdriver().driver().getWebDriver();
    }

    @AfterMethod
    public void tearDownClass(){
        AttachmentsHelper.attachScreenshot("screenshot");
        Selenide.closeWebDriver();
    }

    // function for get configurations local(browser) or remote(selenoid)
    public static void getConfiguration(String runType) {

        switch (runType){
            case("local"):
                Configuration.browser = config.getWebBrowser();
                Configuration.baseUrl = config.getMainUrl();
                Configuration.browserSize = config.getBrowserSize();
                Configuration.timeout = config.getBrowserTimeout();
                Configuration.headless = config.getHeadlessMode();
                break;

        }
    }
}
