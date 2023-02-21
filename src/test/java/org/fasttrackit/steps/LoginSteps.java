package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.utils.Constants;

public class LoginSteps extends BaseSteps {
    HomePage homePage;
    LoginPage loginPage;
    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton(); }
    @Step
    public void loginWithValidCredentials() {
        loginPage.trueCredentialsLogin(Constants.USER_EMAIL, Constants.USER_PASS); }
    @Step
    public void loginWithInvalidCredentials() {
        loginPage.trueCredentialsLogin("blabla@whatever.com", "ihavenoidea"); }
    @Step
    public void checkLoginError() {
        loginPage.checkFailedLogin("ERROR: Invalid email address."); }
    @Step
    public void clickOnOrders () {
        loginPage.clickOnOrdersButton(); }
    @Step
    public void clickLogout () {
        loginPage.clickOnLogoutButton(); }
    @Step
    public void clickSearchBar () {
        loginPage.clickOnSearchBar(); }
    @Step
    public void searchBeanie () {
        loginPage.searchProduct(); }
    @Step
    public void clickShopButton () {
        loginPage.clickOnShopButton(); }
    @Step
    public void validLogin() {
        goToMyAccountButton();
        loginWithValidCredentials();}
    @Step
    public void invalidLogin() {
        goToMyAccountButton();
        loginWithInvalidCredentials();
        checkLoginError(); }
    @Step
    public void goToOrders () {
        goToMyAccountButton();
        loginWithValidCredentials();
        clickOnOrders(); }
    @Step
    public void logout () {
        goToMyAccountButton();
        loginWithValidCredentials();
        clickLogout(); }
    @Step
    public void useSearchBar () {
        goToMyAccountButton();
        loginWithValidCredentials();
        clickSearchBar();
        searchBeanie(); }
    @Step
    public void goToShop (){
        goToMyAccountButton();
        loginWithValidCredentials();
        clickShopButton(); }
}
