package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(String username) {
        waitVisibilityOf(usernameInput);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        return this;
    }


    public LoginPage fillInPassword(String keyPassword) {
        waitVisibilityOf(passwordInput);
        passwordInput.sendKeys(keyPassword);
        return this;
    }

    public void clickLoginButton() {
        waitElementToBeClickable(loginButton);
        loginButton.click();
    }
}


