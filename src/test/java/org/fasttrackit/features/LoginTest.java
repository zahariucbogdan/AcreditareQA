package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Test
    public void validLogin () {
        loginSteps.validLogin();
    }
    @Test
    public void invalidLogin () {
        loginSteps.invalidLogin();
    }
    @Test
    public void viewOrders () {
        loginSteps.goToOrders();
    }
    @Test
    public void successfulLogout () {
        loginSteps.logout();
    }
    @Test
    public void checkSearchBar () {
        loginSteps.useSearchBar();
    }
    @Test
    public void clickSearchButton () {
        loginSteps.goToShop();
    }
}
