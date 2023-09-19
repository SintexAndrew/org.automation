package demoqa.loginPage;

import com.codeborne.selenide.Condition;

public class LoginPage extends Locators{
    private final String loginUrl = "https://demoqa.com/login";
    private final String userName = "TestUserNameSintexAqa";
    private final String password = "%7ygX}Ik";

    public String getLoginUrl() {
        return loginUrl;
    }

    private String getUserName() {
        return userName;
    }

    private String getPassword() {
        return password;
    }

    public void setUserNameField() {
        getUserNameField().clear();
        getUserNameField().val(getUserName());
    }

    public void setPasswordField() {
        getPasswordField().clear();
        getPasswordField().val(getPassword());
    }
    public void pressLoginButton(){
        getLoginButton().click();
    }
    public void checkLoginSuccess(){
        getUserNameAfterLogIn().should(Condition.visible);
    }
}
