package com.sheikotester.tests;

import com.sheikotester.models.Customer;
import com.sheikotester.pages.HomePage;
import com.sheikotester.pages.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        Customer customer = new Customer();
        customer.setEmail("specific@email.com");

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCard()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer, "some comment");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertTrue(orderDetailsPage.getProductName().isDisplayed());
    }
}
