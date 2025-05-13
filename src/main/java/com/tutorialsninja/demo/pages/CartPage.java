package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Reporter;

public class CartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartHeading;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[@class='text-left'][2]")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updateQtyButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successCartUpdateMsg;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;

    public String getShoppingCartHeading() {
        Reporter.log("Getting card button " + shoppingCartHeading.toString() + "<br>");
        return getTextFromElement(shoppingCartHeading);
    }

    public String getProductName() {
        Reporter.log("Gettind product name" + productName.toString() + "<br>");
        return getTextFromElement(productName);
    }

    public String getModelName() {
        Reporter.log("Getting model name " + modelName.toString() + "<br>");
        return getTextFromElement(modelName);
    }

    public String getTotalPrice() {
        Reporter.log("Get total price " + totalPrice.toString() + "<br>");
        WebElement toRightOf = driver.findElement(RelativeLocator.with(By.xpath("//td[@class='text-right']")).toRightOf(By.xpath("//strong[normalize-space()='Total:']")));
        return getTextFromElement(toRightOf);
    }

    public void sendQty(String qty) {
        Reporter.log("click qty " + qtyTextBox.toString() + "<br>");
        qtyTextBox.clear();
        sendTextToElement(qtyTextBox, qty);
    }

    public void clickOnUpdateQty() {
        clickOnElement(updateQtyButton);
        Reporter.log("click update qty " + qtyTextBox.toString() + "<br>");
    }

    public String getSuccessCartUpdateMsg() {
        Reporter.log("Getting message" + successCartUpdateMsg.toString() + "<br>");
        return getTextFromElement(successCartUpdateMsg);
    }

    public void clickOnCheckOut() {
        Reporter.log("click on checkout" + checkOutButton.toString() + "<br>");
        clickOnElement(checkOutButton);
    }


    public byte[] getTextFromElement() {
        return new byte[0];
    }
}