package testPageLocator;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductPageLocators {
    /**
     * Locators main page market
     **/
    public final static SelenideElement
            ProductsPage = $(byId("inventory_container"));


}
