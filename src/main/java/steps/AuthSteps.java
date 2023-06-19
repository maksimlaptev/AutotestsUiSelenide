package steps;

import constants.ErrorsMsg;
import env.Base_Container;
import testPageLocator.LoginPageLocators;

import static io.qameta.allure.Allure.step;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class AuthSteps extends Base_Container {
    LoginPageLocators loginPage;
    OpenPageSteps openPageSteps = new OpenPageSteps();

    public void loginUser(String username,String password) {
        openPageSteps.stepOpenPage("");
        stepInputLoginField(username);
        stepInputPasswordField(password);
        stepClickLogIn();

    }


    // Common Steps
    public void stepClickLogIn(){
        step("Нажатие на кнопку Войти", () -> { loginPage.LogInBtn.click(); });
    }
    public void stepInputLoginField(String username){
        step("Заполнение поля Имя Пользователя", () -> { loginPage.UserNameField.setValue(username); });
    }
    public void stepInputPasswordField(String password){
        step("Заполнение поля Пароль", () -> { loginPage.PasswordField.setValue(password); });
    }

    public void stepCheckPageExist(){
        step("Проверяем что страница логина не отображается", () -> {
            assertFalse( "Страница логина не должна отображаться.",loginPage.LoginPage.exists());
        });
    }

    public void stepCheckError(String msg){
        step("Проверяем что ошибка " +msg+" отображается.", () -> {
            assertEquals("Ошибка под полем пароль должна отображаться.",msg, loginPage.ErrorField.getText());
        });
    }

}
