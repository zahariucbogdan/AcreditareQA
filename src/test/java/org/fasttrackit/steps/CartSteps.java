package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;

public class CartSteps extends BaseSteps {
    CartPage cartPage;
    @Step
    public void changeQuantity() {
        cartPage.addQuantity();
    }
    @Step
    public void clickCheckoutButton () {
        cartPage.clickOnAddToCartButton();
    }
    @Step
    public void ProceedToCheckout () {
        changeQuantity();
        clickCheckoutButton();}
}
