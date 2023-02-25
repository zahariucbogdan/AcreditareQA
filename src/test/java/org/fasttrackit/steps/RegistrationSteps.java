package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegistrationPage;
import org.fasttrackit.utils.Constants;

public class RegistrationSteps extends BaseSteps {
    @Step
    public void goToMyAccountButton() { homePage.clickMyAccountButton(); }
    @Step
    public void setRegistrationEmail() {
        registrationPage.setRegistrationEmail(Constants.USER_EMAIL);
    }
    @Step
    public void setRegistrationPassword() {
        registrationPage.setRegistrationPassword(Constants.USER_PASS);
    }
    @Step
    public void clickOnRegisterButton() {
        registrationPage.clickOnRegisterButton();
    }
    @Step
    public void registration() {
        goToMyAccountButton();
        setRegistrationEmail();
        setRegistrationPassword();
        clickOnRegisterButton(); }
}
