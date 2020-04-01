package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/dynamic_loading/2")
public class ExplicitWait extends PageObject {

    public ExplicitWait(WebDriver driver) {
        super();
    }
    @FindBy(xpath = "//button[contains(text(),'Start')]")
    private WebElementFacade startButton;

    @FindBy(css = "#finish")
    private WebElementFacade heading;

    public void explicitWaitForElement() throws InterruptedException {
    open();

//    startButton.waitUntilClickable().click();
    waitFor(startButton);
    Thread.sleep(5000);
    heading.waitUntilVisible().getText();
    }
}
