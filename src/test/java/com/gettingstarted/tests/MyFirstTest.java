package com.gettingstarted.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
//import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyFirstTest {

    @Managed
    WebDriver driver;

    LocatorExamplePage page;
    @Test
    public void navigateToGoogle() throws InterruptedException {
//       page.sel_clickOnLink();
        page.sel_grabAllElments();
    }

}
