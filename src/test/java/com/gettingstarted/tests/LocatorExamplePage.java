package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LocatorExamplePage extends PageObject {

    public LocatorExamplePage(WebDriver driver){
        super();
    }

    public void sel_clickOnLink() throws InterruptedException {
        open();
        WebElement link = getDriver().findElement(By.xpath("//li[1]//a[1]"));
        link.click();
        Thread.sleep(3000);
    }

    public void sel_grabAllElments() throws InterruptedException {
        open();
        List<WebElement> links = getDriver().findElements(By.tagName("a"));
        for (WebElement link:links){
            System.out.println(link.getText().toUpperCase());
        }
        Thread.sleep(3000);
    }

    public void ser_grabAllElemntsByTag() throws InterruptedException {
        open();
        List <WebElementFacade> links = findAll(By.tagName("a"));
//        for (WebElement link:links){
//            System.out.println(link.getText().toUpperCase());

        //another way of performing the for loop
            links.forEach(e -> System.out.println(e.getText()));
        }
//        Thread.sleep(3000);
    }


