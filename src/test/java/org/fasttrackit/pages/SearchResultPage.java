package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends BasePage {
    @FindBy(css="h1.entry-title a")
    private WebElementFacade beanieProduct;
    public void clickOnResultedProduct() {
        clickOn(beanieProduct);
    }
}
