package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.LogoutPage;
import org.junit.Assert;

public class LogoutSteps extends BaseSteps {
    @Step
    public void checkLogout () {
        Assert.assertTrue(logoutPage.checkLogoutMessage("You are now logged out."));
    }
    @Step
    public void checkLogoutMessage () {
        checkLogout();
    }
}
