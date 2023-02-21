package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElementFacade emailField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButton;
    public void trueCredentialsLogin(String email, String passsword) {
        typeInto(emailField, email);
        typeInto(passwordField, passsword);
        clickOn(loginButton);
    }
    @FindBy(css = "p strong")
    private WebElementFacade hellobogdan;
    public boolean checkLoggedIn(String name) {
        waitFor(hellobogdan);
        return hellobogdan.containsText(name);}
    @FindBy(css = "li strong")
    private WebElementFacade errorMessage;
    public boolean checkFailedLogin(String error) {
        waitFor(errorMessage);
        return errorMessage.containsText(error); }
    @FindBy(css = "li.woocommerce-MyAccount-navigation-link--orders a")
    private WebElementFacade ordersButton;
    public void clickOnOrdersButton() {
        clickOn(ordersButton); }
    @FindBy(css = "aside.widget li:nth-child(2) a")
    private WebElementFacade logoutButton;
    public void clickOnLogoutButton() {
        clickOn(logoutButton); }
    @FindBy (css ="input.search-field")
    private WebElementFacade searchBar;
    public void clickOnSearchBar () {
        clickOn(searchBar); }
    public void searchProduct () {
        searchBar.sendKeys("beanie with logo", Keys.ENTER); }
    @FindBy(css = "li.menu-item-60 a")
    private WebElementFacade shopButton;
    public void clickOnShopButton() {
        clickOn(shopButton); }
}
