package com.demoqa.loginPage;
import com.codeborne.selenide.Selenide;
import demoqa.loginPage.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.demoqa.configuration.browserSettings;

public class LoginTest implements browserSettings {
    LoginPage loginPage = new LoginPage();
    @BeforeTest
    void setConfiguration(){

        browserSettings.chromeBrowserConfiguration(5000, "1920x1080");
        Selenide.open(loginPage.getLoginUrl());
    }

    @Test
    void loginTest() {
        loginPage.setUserNameField();
        loginPage.setPasswordField();
        loginPage.pressLoginButton();
        loginPage.checkLoginSuccess();
    }
}
