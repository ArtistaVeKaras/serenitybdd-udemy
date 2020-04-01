package com.jpetstore.tests;

import com.jpetstore.steps.PetStoreSteps;
import jpetstore.pages.pages.PetCategory;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class DashboardPageTest {

    @Managed
    WebDriver driver;

    @Steps
    PetStoreSteps shopper;

    @Test
    @Title("Selecting product from the dashborad!!")
    public void selectProducFromDashborad() throws InterruptedException {
        shopper.navigateToSignInPage();
        shopper.selectProductFromTheSideMenuBar(PetCategory.DOGS);

    }
}
