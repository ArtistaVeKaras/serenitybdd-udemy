package com.jpetstore.tests;


import com.github.javafaker.Faker;
import com.jpetstore.steps.PetStoreSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccountPageTest {

    @Managed
    WebDriver driver;

    @Steps
    PetStoreSteps shopper;

    @Test
    @Title("")
    public void addNewUserANdVerify() throws InterruptedException {

        Faker faker = new Faker();
    String username = "test" + faker.number().randomNumber(100,false);
    String password = faker.internet().password();
    String repeatPass = faker.name().firstName();
    String fname =faker.name().firstName();
    String lname =faker.name().lastName();
    String email =faker.internet().emailAddress();
    String phne =faker.phoneNumber().cellPhone();
    String add1 =faker.address().buildingNumber();
    String add2 =faker.address().streetAddress();
    String city =faker.address().city();
    String state=faker.address().state();
    String zip =faker.address().zipCode();
    String code=faker.address().countryCode();
    String country =faker.address().country();


    shopper.navigateToSignInPage();
    shopper.navigateToRegistrationPage();
    shopper.registerNewUser(username,password,repeatPass);
    shopper.addAccounInformatio(fname,lname,email,phne,add1,add2,city,state,zip,code,country);
    shopper.profileHedingIsDisplayed();
    shopper.saveUserAccount();
    shopper.doLogin("","");

    }
}
