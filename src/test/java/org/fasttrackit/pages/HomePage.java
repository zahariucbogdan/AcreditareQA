package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
    @FindBy(css = "li.menu-item-58 a")
    private WebElementFacade myAccountButton;
    public void clickMyAccountButton(){
        clickOn(myAccountButton);
    }
}
