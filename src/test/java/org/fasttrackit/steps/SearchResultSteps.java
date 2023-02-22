package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.SearchResultPage;

public class SearchResultSteps extends BaseSteps {
    @Step
    public void clickResultedProduct () {
        searchResultPage.clickOnResultedProduct();
    }
    @Step
    public void selectResultedProduct () {
        clickResultedProduct();
    }
}
