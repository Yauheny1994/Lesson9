package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page {

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement buttonAddFirstElementToCart;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement firstButtonRemove;

    @FindBy(xpath = "//a[@id='item_4_title_link']//div[@class='inventory_item_name']")
    private WebElement nameFirstProductOnInventoryPage;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement buttonCart;

    private String linkInventoryPage = "https://www.saucedemo.com/inventory.html";

    public String getLinkInventoryPage() {
        return linkInventoryPage;
    }

    public WebElement getNameFirstProductOnInventoryPage() {
        return nameFirstProductOnInventoryPage;
    }

    public WebElement getButtonAddFirstElementToCart() {
        return buttonAddFirstElementToCart;
    }

    public WebElement getFirstButtonRemove() {
        return firstButtonRemove;
    }

    public String getTextOfNameOfMainPageSection(){
         return nameOfMainPageSection.getText();
    }

    public WebElement getButtonCart() {
        return buttonCart;
    }
}


