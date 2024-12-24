package com.sheikotester.tests;

import com.sheikotester.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random() * 1000);

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidDate("test" + random + "@mail.com", "test1234@rrrr")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUserInvalidData("test@mail.com", "test1234@rrrr")
                .getError();

        Assert.assertTrue(error.getText().contains("Error: An account is already registered with your email address. Please log in."));
    }
}
