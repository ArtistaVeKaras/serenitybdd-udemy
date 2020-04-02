package com.gettingstarted.tests;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import java.util.List;

public class JavaScriptPage extends PageObject {

    //executing js to interact with elements
    public void executeJS() throws InterruptedException {
        open();
        //both lines perform the same operation
        //evaluateJavascript("document.querySelector(\"a[href='/abtest']\").click()");
        WebElement jsElement  = (WebElement) evaluateJavascript(" return document.querySelector(\"a[href='/abtest']\")");
        jsElement.click();
        Thread.sleep(3000);
    }
    //printing all elements
    public void printAllElements() throws InterruptedException {
        open();
        List<WebElement> jsElement  = (List<WebElement>) evaluateJavascript(" return document.getElementsByTagName(\"a\");");
        for (WebElement element : jsElement){
            System.out.println(element.getText().toUpperCase());
        }
        Thread.sleep(3000);
    }
}
