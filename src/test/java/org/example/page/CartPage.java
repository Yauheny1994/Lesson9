package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameFirstProductInCart;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement buttonContinueShopping;

    public WebElement getButtonContinueShopping() {
        return buttonContinueShopping;
    }

    public WebElement getNameFirstProductInCart() {
        return nameFirstProductInCart;

    }
}
