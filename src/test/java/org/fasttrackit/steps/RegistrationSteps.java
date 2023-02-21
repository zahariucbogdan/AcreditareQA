package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegistrationPage;

public class RegistrationSteps extends BaseSteps {
    HomePage homePage;
    RegistrationPage registrationPage;
    @Step
    public void goToMyAccountButton() { homePage.clickMyAccountButton(); }
    @Step
    public void setRegistrationEmail() {
        registrationPage.setRegistrationEmail("bogdan@gmail.com");
    }
    @Step
    public void setRegistrationPassword() {
        registrationPage.setRegistrationPassword("Qwerty---123456789?");
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
