package org.fasttrackit.features;

import net.thucydides.core.annotations.Step;
import org.junit.Test;

public class OrdersTests extends BaseTest{
    @Test
    public void existingOrders () {
        loginSteps.goToOrders();
        ordersSteps.checkOrders();
    }
}
