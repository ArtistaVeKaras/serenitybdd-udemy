package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/javascript_alerts")
public class JSAlert extends PageObject {

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    private WebElementFacade alertButton;

    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    private WebElementFacade confirmAlertButton;

    @FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
    private WebElementFacade promptAlertButton;

    //accept alert js and get text
    public void jsAlertButton() throws InterruptedException {
        open();
        alertButton.click();
        System.out.println(getAlert().getText());
        Thread.sleep(2000);
        getAlert().accept();
    }
    //emter text in the js field and confirm js alert
    public void sendKeysjsAlertButton() throws InterruptedException {
        open();
        promptAlertButton.click();
        System.out.println(getAlert().getText());
        getAlert().sendKeys("I got this!");
        getAlert().accept();
        Thread.sleep(4000);
    }
}
