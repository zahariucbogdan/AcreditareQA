package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CommentPage;
import org.junit.Assert;

public class CommentSteps extends BaseSteps {
    CommentPage commentPage;
    @Step
    public void checkApproval () {
        Assert.assertTrue(commentPage.checkConfirmation("Your review is awaiting approval")); }
    @Step
    public void approvalMessage () {
        checkApproval();
    }
}
