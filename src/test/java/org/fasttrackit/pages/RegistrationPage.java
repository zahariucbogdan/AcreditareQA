package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(id = "reg_email")
    private WebElementFacade registrationEmail;
    @FindBy(id = "reg_password")
    private WebElementFacade registrationPassword;
    @FindBy(css = ".woocommerce-FormRow > button:nth-child(3)")
    private WebElementFacade registerButton;
    public void setRegistrationEmail(String email) {
        typeInto(registrationEmail, email);
    }
    public void setRegistrationPassword(String password) {
        typeInto(registrationPassword, password);
    }
    public void clickOnRegisterButton() {
        clickOn(registerButton);
    }
}
