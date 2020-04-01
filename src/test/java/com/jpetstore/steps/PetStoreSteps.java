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
        basePage.clickOnSignIn();
        return loginPage.doLogin(username, password);
    }

    /*
    Account page
     */
    @Step("Register a new user with username: {0} & password: {1} & repeatpassword: {2}")
    public AccountPage registerNewUser(String username, String password, String repeatPass) {
        return accountPage.registerNewUser(username, password, repeatPass);
    }

    @Step("user adds account information")
    public AccountPage addAccounInformatio(String fname, String lname, String email,
                                           String phne,  String add1,  String add2,
                                           String city,  String state, String zip,
                                           String code,  String country){
        return accountPage.addAccountInfo(fname,lname,email,phne,add1,add2,
                                          city,state,zip,code,country);
    }

    @Step("Profile heading is displayed")
    public AccountPage profileHedingIsDisplayed(){
        return accountPage.profileInformation();
    }

    @Step("click save user account informatio")
    public AccountPage saveUserAccount(){
        return accountPage.clickSaveAccInfo();
    }
    /*
    Dashboard page
     */

    @Step("Get Welcome message")
    public String getGreetingMessage() {
        return dashbordPage.getGreetingMessage();
    }

    @Step("Select products form the side menu bar")
    public ProductsPage selectProductFromTheSideMenuBar(PetCategory petCategory){
        return dashbordPage.selectProductFromTheSideMenuBar(petCategory);
    }
}