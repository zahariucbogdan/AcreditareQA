package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrdersPage extends BasePage {
    @FindBy(css = "td.woocommerce-orders-table__cell.woocommerce-orders-table__cell-order-number")
    List<WebElementFacade> listOfOrders;
    @FindBy(css = "td.woocommerce-orders-table__cell-order-number a")
    private WebElementFacade orderNumber;
    public boolean checkExistingOrder(String text) {
        for (WebElementFacade orderNumber : listOfOrders) {
            if (orderNumber.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }
}
