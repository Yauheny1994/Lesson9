package org.example.test;

import org.example.page.CartPage;
import org.example.page.InventoryPage;
import org.example.service.InventoryPageService;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InventoryPageTest extends BaseTest {

    @Test
    public void addFirstProductInCartTest() {
        InventoryPageService inventoryPageService = new InventoryPageService();
        InventoryPage inventoryPage = new InventoryPage();
        CartPage cartPage = new CartPage();
        inventoryPageService.login();
        inventoryPageService.addFirstProductInCart();
        inventoryPageService.enterInCart();
        String actualProductInCart = cartPage.getNameFirstProductInCart().getText();
        String expectedProductInCart = inventoryPage.getNameFirstProductOnInventoryPage().getText();
        Assert.assertEquals(actualProductInCart, expectedProductInCart, "Product isn't correct");
    }

    @Test
    public void enterInCartAndQuiteInInventoryTest() {
        InventoryPageService inventoryPageService = new InventoryPageService();
        InventoryPage inventoryPage = new InventoryPage();
        CartPage cartPage = new CartPage();
        inventoryPageService.login();
        inventoryPageService.enterInCart();
        cartPage.getButtonContinueShopping().click();
        String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPageSection();
        String expectedPageText = "PRODUCTS";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageText, "The actual text of the page does not " +
                "match expected!");

    }

}

