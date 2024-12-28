package com.sheikotester.pages;

import com.sheikotester.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a")
    private WebElement proceedToCheckoutButton;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public AddressDetailsPage openAddressDetails() {
        SeleniumHelper.waitForClickable(proceedToCheckoutButton, driver );
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);

    }
}
