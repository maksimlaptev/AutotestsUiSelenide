package UI;

import constants.ErrorsMsg;
import env.Base_Container;
import helpers.Generator;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.AuthSteps;

import static constants.data.*;

@Feature("Web testing")
@Story("Auth")

public class TestLogin extends Base_Container {

   // static final UrlsConfig urlConfig = ConfigFactory.create(UrlsConfig.class, System.getProperties());
    Generator generator;
    AuthSteps authSteps = new AuthSteps();
    String email, nameCompany;

    @BeforeMethod
    public void setSetup() {

        generator = new Generator();
       // email = generator.getEmail();
    }

    @Test
    @Description("Проверка авторизации с некорректными данными.")
    public void testCorrectAuth() {
     // action
     authSteps.loginUser(USER_LOGIN,USER_PASSWORD);

     // verification
     authSteps.stepCheckPageExist();

    }

    @Test
    @Description("Проверка авторизации с корректными данными.")
    public void testIncorrectAuth() {
     // action
     authSteps.loginUser("123","123");

     // verification
     authSteps.stepCheckError(ErrorsMsg.error_data_not_match.getErrorMsg());

    }




}
