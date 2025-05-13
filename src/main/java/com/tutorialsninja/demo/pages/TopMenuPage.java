package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//li//a")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement deskTopLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNoteLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement componentsLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement deskTopHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
    WebElement laptopsAndNoteHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Components']")
    WebElement componentsHeading;


    public void selectMenu(String menu) {
        List<WebElement> topMenuElements = topMenu;
        for (WebElement e : topMenuElements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    public void mouseHoverOnDesktopAndClick() {
        mouseHoverToElementAndClick(deskTopLink);
        Reporter.log("Click on " + deskTopLink.toString() + "<br>");
    }

    public String getDesktopHeading() {
        Reporter.log("get " + deskTopHeading.toString() + "<br>");
        return getTextFromElement(deskTopHeading);
    }

    public void mouseHoverOnLaptopsAndNotebookAndClick() {
        mouseHoverToElementAndClick(laptopsAndNoteLink);
        Reporter.log("Click on " + laptopsAndNoteLink.toString()+ "<br>");
    }

    public String getLaptopANdNotebookHeading() {
        Reporter.log("get " + laptopsAndNoteHeading.toString() + "<br>");
        return getTextFromElement(laptopsAndNoteHeading);
    }

    public void mouseHoverOnComponentsAndClick() {
        mouseHoverToElementAndClick(componentsLink);
        Reporter.log("Click on " + componentsLink.toString() + "<br>");
    }

    public String getComponentsHeading() {
        Reporter.log("get " + componentsHeading.toString() + "<br>");
        return getTextFromElement(componentsHeading);
    }
}