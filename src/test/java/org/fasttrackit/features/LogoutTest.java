package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LogoutTest extends BaseTest {
    @Test
    public void successfulLogout () {
        loginSteps.logout();
        logoutSteps.checkLogoutMessage();

    }
}
