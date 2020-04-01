package jpetstore.pages.pages;

import org.mybatis.jpetstore.domain.Account;

public class AccountPage extends BasePage{

    public static final String USER_ID = "//input[@id='stripes--1973415522']";
    public static final String NEW_PASSWORD = "//input[@name='password']";
    public static final String REPEAT_PASSWORD = "//input[@name='repeatedPassword']";
    public static final String FIRST_NAME = "";
    public static final String LAST_NAME = "";
    public static final String EMAIL = "";
    public static final String PHONE = "";
    public static final String ADDRESS1 = "";
    public static final String ADDRESS2 = "";
    public static final String CITY = "";
    public static final String STATE = "";
    public static final String ZIP = "";
    public static final String CODE = "";
    public static final String COUNTRY = "";
    public static final String SAVE_ACCOUNT_INFO = "";

    //add new user information
    public AccountPage registerNewUser(String username, String password, String repeatPass){

        waitFor(USER_ID).$(USER_ID).type(username);
        waitFor(NEW_PASSWORD).$(NEW_PASSWORD).type(password);
        waitFor(REPEAT_PASSWORD).$(REPEAT_PASSWORD).type(repeatPass);
        return this;
    }

    //adding new user information
    public AccountPage addAccountInfo(String fname, String lname, String email,
                                      String phne,  String add1,  String add2,
                                      String city,  String state, String zip,
                                      String code,  String coutry){

        waitForTextToAppear("//h3[contains(text(),'Account Information')]");
        waitFor(FIRST_NAME).$(FIRST_NAME).type(fname);
        waitFor(LAST_NAME).$(LAST_NAME).type(lname);
        waitFor(EMAIL).$(EMAIL).type(email);
        waitFor(PHONE).$(PHONE).type(phne);
        waitFor(ADDRESS1).$(ADDRESS1).type(add1);
        waitFor(ADDRESS2).$(ADDRESS2).type(add2);
        waitFor(CITY).$(CITY).type(city);
        waitFor(STATE).$(STATE).type(state);
        waitFor(ZIP).$(ZIP).type(zip);
        waitFor(CODE).$(CODE).type(code);
        waitFor(COUNTRY).$(COUNTRY).type(coutry);
            return this;
    }
   //profile information
    public AccountPage profileInformation(){
        waitForTextToAppear("//h3[contains(text(),'Profile Information')]");
        return this;
    }

    //click save account information
    public AccountPage clickSaveAccInfo(){
        waitFor(SAVE_ACCOUNT_INFO).$(SAVE_ACCOUNT_INFO).click();
        return  this;
    }
}
