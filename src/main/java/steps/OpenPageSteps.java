package steps;

import configs.WebDriverConfig;
import env.Base_Container;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPageSteps extends Base_Container {

    static final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());


    // Common Steps
    public void stepOpenPage(String path){
       step("Открытие страницы " + config.getMainUrl()+path, () -> open(config.getMainUrl()+path));
    }


}
