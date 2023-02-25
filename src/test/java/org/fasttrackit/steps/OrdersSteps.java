package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.OrdersPage;
import org.junit.Assert;

public class OrdersSteps extends BaseSteps {
    @Step
    public void checkExistingOrders () {
        Assert.assertTrue(ordersPage.checkExistingOrder("#917"));
    }
    @Step
    public void checkOrders () {
        checkExistingOrders();
    }
}
