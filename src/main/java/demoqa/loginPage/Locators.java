package demoqa.loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Locators {
    private final SelenideElement userNameField = $(By.id("userName"));
    private final SelenideElement passwordField = $(By.id("password"));
    private final SelenideElement loginButton = $(By.id("login"));
    private final SelenideElement userNameAfterLogIn = $(By.id("userName-value"));

    SelenideElement getUserNameField() {
        return userNameField;
    }

    SelenideElement getPasswordField() {
        return passwordField;
    }

    SelenideElement getLoginButton() {
        return loginButton;
    }

    SelenideElement getUserNameAfterLogIn() {
        return userNameAfterLogIn;
    }
}
