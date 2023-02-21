package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AddToCartSteps extends BaseSteps {
    AddToCartSteps addToCartSteps;
    @Step
    public void selectFromList () {
        addToCartPage.selectProduct("Beanie with Logo");
    }
    @Step
    private void selectProduct(String beanieWithLogo) {
    }

    @Step
    public void viewCart() {
        addToCartPage.viewCart();
    }

    @Step
    public void addBeanieToCart() {
        selectFromList();
        viewCart();
    }
}
