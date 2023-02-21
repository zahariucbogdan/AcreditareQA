package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.ProductPage;

public class ProductSteps extends BaseSteps {
    ProductPage productPage;
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
