package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/login")
public class EditBoxPage extends PageObject {

    @FindBy(id = "username") public WebElementFacade username;
    @FindBy(id = "password") public WebElementFacade password;
    @FindBy(xpath = "//i[@class='fa fa-2x fa-sign-in']") public WebElementFacade clickButton;

    public void editBoxTest(){
        open();
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        clickButton.click();
    }
    //this will send the keys in the box field and tab to the next element
    public void editBoxAndTypeExmaple() throws InterruptedException {
        open();
//        username.type("tomsmith");
//        password.type("SuperSecretPassword!");
        username.typeAndTab("tomsmith");
        password.typeAndTab("SuperSecretPassword!");
        Thread.sleep(1000);
        clickButton.click();
    }
}
