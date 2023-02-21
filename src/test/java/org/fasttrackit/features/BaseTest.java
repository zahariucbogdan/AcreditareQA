package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Steps
    protected AddToCartSteps addToCartSteps;
    @Steps
    protected AddToCartSteps cartSteps;
    @Steps
    protected CommentSteps commentSteps;
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected LogoutSteps logoutSteps;
    @Steps
    protected OrdersSteps ordersSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected RegistrationSteps registrationSteps;
    @Steps
    protected SearchResultSteps searchResultSteps;
    }
}
