package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {
    @FindBy(css = "a.button.wc-foward")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addtocart;
    @FindBy(css = ".product-price .amount")
    private WebElementFacade productPriceSpan;
    @FindBy(css = ".product-subtotal .amount")
    private WebElementFacade priceTotal;
    @FindBy(css = "input.input-text.qty")
    private WebElementFacade quantityButton;
    public void addQuantity() {
        typeInto(quantityButton, "12");
    }
    public void clickOnAddToCartButton() {
        clickOn(addtocart);
    }
    public void clickOnCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }
    }