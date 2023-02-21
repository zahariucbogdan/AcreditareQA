package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RegistrationTest extends BaseTest{
    @Test
    public void validRegistration(){
        registrationSteps.goToMyAccountButton();
        registrationSteps.setRegistrationEmail();
        registrationSteps.setRegistrationPassword();
        registrationSteps.clickOnRegisterButton();
    }
}
