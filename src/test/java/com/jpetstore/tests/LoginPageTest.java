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

    @Test
    @Title("Verify user is able to logout")
    public void verifyUserCanLogout() throws InterruptedException {

        storeSteps.navigateToSignInPage();
        storeSteps.doLogin("bob", "bob");
        storeSteps.signOut();
    }

    @Test
    @Title("Verify use recieves invalid message when sign in with invalid credentials")
    public void verifyIfMessageIsDisplayed() throws InterruptedException {
        storeSteps.navigateToSignInPage();
        storeSteps.doLogin("ok","ok");
       String expMesg = storeSteps.getInvalidMessgeString();
       assertEquals("Invalid username or password. Signon failed.",expMesg);
    }
}
