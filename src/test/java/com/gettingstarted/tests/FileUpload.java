package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.io.File;

@DefaultUrl("/upload")
public class FileUpload extends PageObject {

    @FindBy(id = "file-submit")
    private WebElementFacade upload;


    //upload file to webelement
    public void uploadFile() throws InterruptedException {
        open();
        String filePath = System.getProperty("user.dir") + File.separator + "ubuntu-linux.jpg";
        upload(filePath).to($("//input[@id='file-upload']"));
        $("//input[@id='file-submit']").click();
        Thread.sleep(5000);
    }
}
