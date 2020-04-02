package com.gettingstarted.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyFirstTest {

    @Managed
    WebDriver driver;

    LocatorExamplePage page;
    EditBoxPage editBoxPage;
    Dropdown dropdown;
    CheckBoxes checkBoxes;
    TablePage tablePage;
    ExplicitWait explicitWait;
    FileUpload uploadFile;
    JavaScriptPage javaScriptPage;
    JSAlert alert;

    @Test
    public void navigateToGoogle() throws InterruptedException {
//       page.sel_clickOnLink();
//        page.sel_grabAllElments();
//        page.ser_grabAllElemntsByTag();
//        editBoxPage.editBoxTest();
//        editBoxPage.editBoxAndTypeExmaple();
//        dropdown.selectValue();
//        checkBoxes.selectCheckBox();
//          tablePage.readCompleteTable();
//          tablePage.extractFilterdRowsFromTable();
//        tablePage.extracHeadings();
//        tablePage.extractAllRows();
//        tablePage.extractRowsBasedOnConditions();
//        tablePage.assertOnTableElement();
//        explicitWait.explicitWaitForElement();
//            uploadFile.uploadFile();
//            alert.jsAlertButton();
//        alert.sendKeysjsAlertButton();
    }
}
