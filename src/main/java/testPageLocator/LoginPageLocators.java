package testPageLocator;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
public class LoginPageLocators {
    /**
     * Locators main page market
     **/
    public final static SelenideElement
            LoginPage = $(byClassName("login_container")),
            UserNameField = $(byId("user-name")),
            PasswordField = $(byAttribute("data-test", "password")),
            ErrorField = $(byAttribute("data-test", "error")),
            LogInBtn = $(byCssSelector(".submit-button"));

   /* public static SelenideElement  ProductCard(String nameProduct){
        return Selenide.$(byXpath("//*[@class='product-card__name'][contains(text(),'"+nameProduct+"')]"));
    }
   public static ElementsCollection
           NamesProducts = $$(By.xpath("//*[@class='product-grid__list']//*[@class='product-card__name']"));
    }

*/
}
