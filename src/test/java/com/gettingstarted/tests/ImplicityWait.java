package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

@DefaultUrl("/dynamic_loading/1")
public class ImplicityWait extends PageObject {

    @FindBy(tagName = "button")
    WebElementFacade startButton;

    public void implicitWait() throws InterruptedException{
        try {
            open();
//            setImplicitTimeout(8, TimeUnit.SECONDS);
            System.out.println(getImplicitWaitTimeout().toString());
            startButton.click();
        }finally {

        }
    }
}
