package com.gettingstarted.tests;


import com.google.inject.internal.cglib.proxy.$NoOp;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/checkboxes")
public class CheckBoxes extends PageObject {

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    public WebElementFacade _ckbox2;
    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    public WebElementFacade _ckbox1;

    /*select the first checkbox
   and unselect the second box
    * */
    public void selectCheckBox() throws InterruptedException {
        open();
        Checkbox checkbox = new Checkbox(_ckbox1);
//        checkbox.setChecked(true);

        Checkbox checkbox2 = new Checkbox(_ckbox2);
//        checkbox2.setChecked(false);

        //checking the status of the checkboxes
        System.out.println(checkbox.isChecked());
        System.out.println(checkbox2.isChecked());
        Thread.sleep(2000);
    }
}
