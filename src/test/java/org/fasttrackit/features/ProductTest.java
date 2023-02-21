package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ProductTest extends BaseTest {
    @Test
    public void checkReviewMaximumLength () {
        loginSteps.useSearchBar();
        searchResultSteps.selectResultedProduct();
        productSteps.writeReview();
    }
}
