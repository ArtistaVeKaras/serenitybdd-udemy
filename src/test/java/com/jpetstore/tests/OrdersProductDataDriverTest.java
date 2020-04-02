package com.jpetstore.tests;

import com.jpetstore.steps.PetStoreSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/testdata/orders.csv")
public class OrdersProductDataDriverTest {

    @Managed
    WebDriver driver;


    @Steps
    PetStoreSteps shopper;

    @Test
    @Title("Data driver test from csv file")

  public void dataDriver(){

    }
}
