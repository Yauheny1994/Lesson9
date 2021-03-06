package org.example.service;

import org.example.model.User;
import org.example.page.InventoryPage;
import org.example.page.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";

    public LoginPage loginPage = new LoginPage();
    private User user = new User();

    public InventoryPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(user.getName())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPage();
    }
}


