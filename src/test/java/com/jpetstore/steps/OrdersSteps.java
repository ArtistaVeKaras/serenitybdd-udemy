package com.jpetstore.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OrdersSteps {

    @Steps

    PetStoreSteps shopper;


    @Given("I login to the application with valid bob and bob")
    public void i_login_to_the_application_with_valid_bob_and_bob() throws InterruptedException {
        shopper.navigateToSignInPage();
        shopper.doLogin("bob","bob");
    }

    @And("I search for a {string} it must show up in the search results")
    public void i_search_for_a_it_must_show_up_in_the_search_results(String string) {

    }

    @And("I view details about the pet {string} and add it to cart")
    public void i_view_details_about_the_pet_and_add_it_to_cart(String string) {
    }

    @And("I proceed to the chekcout")
    public void i_proceed_to_the_chekcout() {
    }

    @And("I enter my payment details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void i_enter_my_payment_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {
    }

    @Then("I submit the order, the store must provide me with a confirmation message on the placed order")
    public void i_submit_the_order_the_sstore_must_provide_me_with_a_confirmation_message_on_the_placed_order() {
    }
}
