package jpetstore.pages.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(name = "username") public WebElementFacade USER_ID;
    @FindBy(name = "password") public WebElementFacade PASSWORD;
    @FindBy(name = "repeatedPassword") public WebElementFacade REPEATPASSWORD;
    @FindBy(name = "account.phone") public WebElementFacade PHONE;
    @FindBy(name = "account.firstName") public WebElementFacade FIRST_NAME;
    @FindBy(name = "account.lastName") public WebElementFacade LAST_NAME;
    @FindBy(name = "account.lastName") public WebElementFacade EMAIL;
    @FindBy(name = "account.address1") public WebElementFacade ADDRESS1;
    @FindBy(name = "account.address2") public WebElementFacade ADDRESS2;
    @FindBy(name = "account.city") public WebElementFacade CITY;
    @FindBy(name = "account.state") public WebElementFacade STATE;
    @FindBy(name = "account.zip") public WebElementFacade ZIP;
    @FindBy(name = "account.code") public WebElementFacade CODE;
    @FindBy(name = "account.country") public WebElementFacade COUNTRY;
    @FindBy(name = "newAccount") public WebElementFacade SAVE_ACCOUNT_INFO;

    //add new user information
    public AccountPage registerNewUser(String username, String password, String repeatPass){

        waitFor(USER_ID).type(username);
        waitFor(PASSWORD).type(password);
        waitFor(REPEATPASSWORD).type(repeatPass);
        return this;
    }

    //adding new user information
    public AccountPage addAccountInfo(String fname, String lname, String email,
                                      String phne,  String add1,  String add2,
                                      String city,  String state, String zip,
                                      String code,  String coutry){

        waitForTextToAppear("//h3[contains(text(),'Account Information')]");
        waitFor(FIRST_NAME).type(fname);
        waitFor(LAST_NAME).type(lname);
        waitFor(EMAIL).type(email);
        waitFor(PHONE).type(phne);
        waitFor(ADDRESS1).type(add1);
        waitFor(ADDRESS2).type(add2);
        waitFor(CITY).type(city);
        waitFor(STATE).type(state);
        waitFor(ZIP).type(zip);
        waitFor(CODE).type(code);
        waitFor(COUNTRY).type(coutry);
            return this;
    }
   //profile information
    public AccountPage profileInformation(){
        waitForTextToAppear("//h3[contains(text(),'Profile Information')]");
        return this;
    }

    //click save account information
    public AccountPage clickSaveAccInfo(){
        waitFor(SAVE_ACCOUNT_INFO).click();
        return  this;
    }
}
