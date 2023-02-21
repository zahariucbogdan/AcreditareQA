package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest {
    @Test
    public void validAddToCart () {
        loginSteps.useSearchBar();
        searchResultSteps.clickResultedProduct();
        addToCartSteps.addBeanieToCart();
    }
}
