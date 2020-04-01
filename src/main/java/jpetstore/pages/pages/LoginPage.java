package jpetstore.pages.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    public static WebElementFacade USERNAME_INPUT;
    @FindBy(name = "password")
    public static WebElementFacade PASSWORD_INPUT;
    @FindBy(xpath = "//a[contains(text(),'Register Now!')]")
    public static WebElementFacade REGISTER_LINK;
    @FindBy(name = "signon")
    public static WebElementFacade LOGIN_BUTTON;

    @FindBy(xpath = "//li[contains(text(),'Signon failed.')]")
    public static WebElementFacade REGISTRAGION_FAILED_MESSAGE;

    public DashbordPage doLogin(String username, String password){

        waitForTextToAppear("Please enter your username and password.");
        waitForTextToAppear("Need a user name and password?");
        waitFor(USERNAME_INPUT).type(username);
        waitFor(PASSWORD_INPUT).type(password);
        waitFor(LOGIN_BUTTON).click();
        return this.switchToPage(DashbordPage.class);
    }

    public AccountPage navigateToRegistrationPage(){

        waitForTextToAppear("Please enter your username and password.");
        waitForTextToAppear("Need a user name and password?");
        waitFor(REGISTER_LINK).click();
        return switchToPage(AccountPage.class);
    }

    public String getInvalidMessgeString(){
        return waitFor(REGISTRAGION_FAILED_MESSAGE).getText();
    }
}
