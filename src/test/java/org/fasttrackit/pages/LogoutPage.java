package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
    @FindBy(css="p.message")
    private WebElementFacade logoutMessage;
    public boolean checkLogoutMessage (String loggedout) {
        System.out.println(logoutMessage.getText());
        return logoutMessage.containsText(loggedout); }
}
