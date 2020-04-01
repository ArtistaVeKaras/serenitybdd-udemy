package com.jpetstore.tests;

import com.jpetstore.steps.PetStoreSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Managed
    WebDriver driver;

    @Steps
    PetStoreSteps storeSteps;

    @Test
    @Title("Verify if user can login successfully with valid credentials")
    public void verifyUserCanLogin() throws InterruptedException {
        storeSteps.navigateToSignInPage();
        storeSteps.doLogin("bob","bob");
        String GreeetingMsg = storeSteps.getGreetingMessage();
        assertEquals("Welcome jlk!",GreeetingMsg);
    }
}
