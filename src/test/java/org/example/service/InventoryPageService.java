package org.example.service;

import org.example.page.InventoryPage;

public class InventoryPageService extends LoginPageService {

    InventoryPage inventoryPage = new InventoryPage();

    @Override
    public InventoryPage login() {
        return super.login();
    }

    public void addFirstProductInCart() {
        inventoryPage.getButtonAddFirstElementToCart().click();
    }

    public void enterInCart() {
        inventoryPage.getButtonCart().click();
    }

}
