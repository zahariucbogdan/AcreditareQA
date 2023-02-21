package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchResultTest extends BaseTest {
    @Test
    public void selectFromResults () {
        loginSteps.useSearchBar();
        searchResultSteps.clickResultedProduct();
    }
}
