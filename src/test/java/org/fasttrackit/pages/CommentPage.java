package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CommentPage extends BasePage {
    @FindBy(css="em.woocommerce-review__awaiting-approval")
    private WebElementFacade approvalMessage;
    public boolean checkConfirmation (String approval) {
        return approvalMessage.containsText(approval);

    }
}
