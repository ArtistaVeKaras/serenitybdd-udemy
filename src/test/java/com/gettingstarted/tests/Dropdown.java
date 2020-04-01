package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/dropdown")
public class Dropdown extends PageObject {

    @FindBy (id = "dropdown") private WebElementFacade dropdown;

    public void selectValue() throws InterruptedException {
        open();
        net.thucydides.core.pages.components.Dropdown.forWebElement(dropdown).selectByValue("2");
        Thread.sleep(2000);
    }
}
