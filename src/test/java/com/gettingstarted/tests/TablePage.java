package com.gettingstarted.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.components.HtmlTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static net.thucydides.core.matchers.BeanMatchers.the;
import static net.thucydides.core.pages.components.HtmlTable.filterRows;
import static net.thucydides.core.pages.components.HtmlTable.inTable;
import static org.hamcrest.CoreMatchers.*;

@DefaultUrl("/tables")
public class TablePage extends PageObject {

    @FindBy(how = How.ID, using = "table2")
    protected WebElementFacade table;

    //read the complete table as a list of key value pairs
    public void readCompleteTable(){
    open();
    List<Map<Object, String>> tbl =
            HtmlTable.rowsFrom(table);
        System.out.println(tbl);
    }
    //extract rows based on certain conditions email ending with yahoo.com
    public void extractFilterdRowsFromTable(){

        open();
        List<WebElement> rowsValue =
                filterRows(table, the ("Email", endsWith("yahoo.com")));
        for (WebElement e : rowsValue){
            System.out.println(e.getText());
        }
    }
    //extracting the headings
    public void extracHeadings(){
        open();
        List<String> heading = inTable(table).getHeadings();
        for (String h : heading){
            System.out.println(heading);
        }
    }
    //extrac all the rows expect the headings
    public void extractAllRows(){
        open();
        List<WebElement> rowsElements =
                inTable(table).getRowElements();
        for (WebElement r : rowsElements){
            System.out.println(r.getText());
        }
    }
    //extract based on certains conditions
    public void extractRowsBasedOnConditions(){
        open();
        List<WebElement> row = inTable(table).getRowElementsWhere(the("First Name", equalTo("Frank")));
        for (WebElement r :row ){
            System.out.println(r.getText());
        }
    }
    //assert elements present on the table
    public void assertOnTableElement(){
        open();
        inTable(table).shouldHaveRowElementsWhere(the("First Name",equalTo("Frank")));
        inTable(table).shouldNotHaveRowElementsWhere(the("First Name",equalTo("clau")));
    }
}
