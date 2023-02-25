package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;


public class ProductSteps extends BaseSteps {
    @Step
    public void clickReviewButton () {
        productPage.clickOnReviewButton();
    }
    @Step
    public void selectRating () {
        productPage.selectRating();
    }
    @Step
    public void writeComment () {
        productPage.writeComment();
    }
    @Step
    public void clickSubmitButton () {
        productPage.clickOnSubmitButton();
    }
    @Step
    public void writeReview () {
        clickReviewButton();
        selectRating();
        writeComment();
        clickSubmitButton(); }
}
