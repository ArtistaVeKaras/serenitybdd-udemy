package com.jpetstore.steps;

import jpetstore.pages.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps {

    BasePage basePage;
    LoginPage loginPage;
    AccountPage accountPage;
    DashbordPage dashbordPage;

    //This is a wrapper
    @Step("Signig out from the store")
    public DashbordPage signOut() {
        return basePage.signOut();
    }

    @Step("Navigate to the sign page")
    public LoginPage navigateToSignInPage() throws InterruptedException {
        return basePage.navigateToSignInPage();
    }

    @Step("Nagivate to the product category page and select a category")
    public ProductsPage navigateToProductCategoryPage(PetCategory productCategory) {
        return basePage.navigateToProductCategoryPage(productCategory);
    }

    @Step("click on sign button")
    public LoginPage clickOnSignIn() {
        return basePage.clickOnSignIn();
    }

    @Step("signing to the store")
    public LoginPage signInToStore() {
        return basePage.signInToStore();
    }

    @Step("navigate to the dashboard")
    public DashbordPage navigateToDashboard() {
        return basePage.navigateToDashboard();
    }

    @Step("navigate to account page")
    public AccountPage nagivateToAccountPage() {
        return basePage.nagivateToAccountPage();
    }

    /*
    Login steps
     */
    @Step("Get invalid login message")
    public String getInvalidMessgeString() {
        return loginPage.getInvalidMessgeString();
    }

    @Step("navigate to the registration page")
    public AccountPage navigateToRegistrationPage() {
        return loginPage.navigateToRegistrationPage();
    }

    @Step("Login into application with username: {0} & password: {1}")
    public DashbordPage doLogin(String username, String password) {
        return loginPage.doLogin(username, password);
    }

    /*
    Account page
     */
    @Step("Register a new user with username: {0} & password: {1} & repeatpassword: {2}")
    public AccountPage registerNewUser(String username, String password, String repeatPass) {
        return accountPage.registerNewUser(username, password, repeatPass);
    }

    /*
    Dashboard page
     */

    @Step("Get Welcome message")
    public String getGreetingMessage() {
        return dashbordPage.getGreetingMessage();
    }
}