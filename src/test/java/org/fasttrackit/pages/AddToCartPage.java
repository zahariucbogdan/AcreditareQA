package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class AddToCartPage extends BasePage {
    @FindBy(css = "a[data-product_sku='Woo-beanie-logo']")
    private WebElementFacade product;
    @FindBy(css = "a.added_to_cart")
    private WebElementFacade addToCart;
    @FindBy(css = ".product")
    List<WebElementFacade> listOfProducts;
    public boolean selectProduct(String text) {
        for (WebElementFacade product : listOfProducts) {
            if (product.getText().contains(text)) {
                product.findElement(By.cssSelector(".add_to_cart_button")).click();
                return true;
            }
        }
        return false;
    }
    public void viewCart() {
        clickOn(addToCart);
    }
}
