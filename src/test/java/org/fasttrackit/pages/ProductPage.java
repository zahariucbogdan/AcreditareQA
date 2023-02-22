package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy(css= "li.reviews_tab a")
    private WebElementFacade reviewButton;
    @FindBy (css = "a.star-5")
    private WebElementFacade rateStars;
    @FindBy (css="textarea#comment")
    private WebElementFacade reviewField;
    @FindBy (css="input.submit")
    private WebElementFacade submitButton;
    public void clickOnReviewButton () {
        clickOn(reviewButton);
    }
    public void selectRating () {
        clickOn(rateStars);
    }
    public void writeComment (){
        typeInto(reviewField, "Test comment !");
    }
    public void clickOnSubmitButton () {
        clickOn(submitButton);
    }
}
