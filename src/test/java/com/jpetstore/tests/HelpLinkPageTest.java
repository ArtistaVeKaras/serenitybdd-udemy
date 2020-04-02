package com.jpetstore.tests;


import com.jpetstore.steps.PetStoreSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HelpLinkPageTest {

    @Managed
    WebDriver driver;

    @Steps
    PetStoreSteps shopper;

    @Test
    @Title("navigate to help page")
    public void navigateToHelpHomePage() throws InterruptedException {
        shopper.navigateToSignInPage();
        shopper.navigateToHelpPage();
    }
}
