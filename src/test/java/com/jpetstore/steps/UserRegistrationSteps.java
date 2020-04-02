package com.jpetstore.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class UserRegistrationSteps {

    @Steps
    PetStoreSteps shopper;

    @Given("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() throws InterruptedException {
        shopper.navigateToSignInPage();
        shopper.navigateToRegistrationPage();
    }

    @And("I add new user information")
    public void i_add_new_user_information() {

        Faker faker = new Faker();

        String username = "test"+ faker.number().randomNumber(100,false);
        String password = faker.internet().password();
        String repeatPassword = password;
        shopper.registerNewUser(username,password,repeatPassword);

        //setting session  variable
        Serenity.setSessionVariable("username").to(username);
        Serenity.setSessionVariable("password").to(password);
    }

    @And("I add acount information")
    public void i_add_acount_information() {

        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        Serenity.setSessionVariable("firstname").to(firstname);
        String lastname = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String phonenumber = faker.phoneNumber().cellPhone();
        String addr1 = faker.address().buildingNumber();
        String addr2 = faker.address().streetName();
        String city = faker.address().city();
        String state = faker.address().state();
        String zipcode =faker.address().zipCode();
        String code = faker.address().countryCode();
        String country =faker.address().country();

        shopper.addAccounInformatio(firstname,lastname,email,phonenumber,addr1,addr2,city,state,zipcode,code,country);
    }

    @And("I add profile information")
    public void i_add_profile_information() {

        //this method is properly set
        shopper.profileHedingIsDisplayed();
    }

    @And("I click save information")
    public void i_click_save_information() {
        shopper.saveUserAccount();
    }
    @When("I login with my credentials")
    public void i_login_with_my_credentials() {

        String username =Serenity.sessionVariableCalled("username");
        String password =Serenity.sessionVariableCalled("password");
        shopper.doLogin(username,password);
    }

    @Then("I must b able to view the welcome greeting with my name")
    public void i_mus_b_able_to_view_the_welcome_greeting_with_my_name() {
        String result = shopper.getGreetingMessage();
        assertEquals("Welcome" + Serenity.sessionVariableCalled("firstname").toString()+
                "!",result);

    }
}
