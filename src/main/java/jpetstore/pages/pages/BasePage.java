package jpetstore.pages.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    //page links
    public static final String ENTER_THE_STORE_LINK = "//a[contains(text(),'Enter the Store')]";
    public static final String SIGN_IN_LINK = "//a[contains(text(),'Sign In')]";
    public static final String SEARCH_LINK = "//input[@name='searchProducts']";
    public static final String SHOP_CHART_LINK = "//img[@name='img_cart']";
    public static final String DASH_BOARD_LINK = "//div[@id='LogoContent']//a//img";
    public static final String ENTER_TEXT_FIELD_LINK = "//input[@name='keyword']";
    public static final String SIGN_OUT_LINK = "//a[contains(text(),'Sign Out')]";
    public static final String MY_ACCOUNT_LINK = "//a[contains(text(),'My Account')]";
    public static final String USERNAMA_TEXT_FIELD_LINK = "//input[@id='stripes--1782187985']";
    public static final String PASSWORD_TEXT_FIELD_LINK = "//input[@name='password']";
    public static final String LOGIN_BUTTON_LINK = "//input[@name='signon']";
    public static final String HELP_LINK = "//a[contains(text(),'?')]";

    //Products Link
    public static final String FISH_LINK = "//div[@id='Content']//a[1]//img[1]";
    public static final String CATS_LINKS  = "//div[@id='Content']//a[2]//img[1]";
    public static final String DOGS_LINKS = "//div[@id='Content']//a[3]//img[1]";
    public static final String REPTILES_LINKS = "//div[@id='Content']//a[4]//img[1]";
    public static final String BIRDS_LINKS = "//div[@id='Content']//a[5]//img[1]";

    // navigates to the sign in page
    public LoginPage navigateToSignInPage() throws InterruptedException {
    open();
    waitFor(ENTER_THE_STORE_LINK).$(ENTER_THE_STORE_LINK).click();
//    waitFor(SIGN_IN_LINK).$(SIGN_IN_LINK).click();
        Thread.sleep(2000);
        return this.switchToPage(LoginPage.class);
}
    // clicks the sign in button
    public LoginPage clickOnSignIn(){
        waitFor(SIGN_IN_LINK).$(SIGN_IN_LINK).click();
        return this.switchToPage(LoginPage.class);
    }
    //signs in to the login page
    public LoginPage signInToStore(){
        waitFor(USERNAMA_TEXT_FIELD_LINK).$(USERNAMA_TEXT_FIELD_LINK).sendKeys("root");
        waitFor(PASSWORD_TEXT_FIELD_LINK).$(PASSWORD_TEXT_FIELD_LINK).sendKeys("root");
        waitFor(LOGIN_BUTTON_LINK).$(LOGIN_BUTTON_LINK).click();
        return this.switchToPage(LoginPage.class);
    }
    //navigate to the dashboard
    public DashbordPage navigateToDashboard(){
        open();
        waitFor(DASH_BOARD_LINK).$(DASH_BOARD_LINK).click();
        return switchToPage(DashbordPage.class);
    }
    //click sign out link
    public DashbordPage signOut(){
        waitFor(SIGN_OUT_LINK).$(SIGN_OUT_LINK).click();
        waitFor(SIGN_OUT_LINK).shouldNotBeVisible(By.xpath(SIGN_OUT_LINK));
        return switchToPage(DashbordPage.class);
    }
    //navigate to account page
    public AccountPage nagivateToAccountPage(){
        waitFor(MY_ACCOUNT_LINK).$(MY_ACCOUNT_LINK).click();
        return switchToPage(AccountPage.class);
    }
    //search for products
    public ProductsPage searchForProduct(String searchValue){
        waitFor(ENTER_TEXT_FIELD_LINK).$(ENTER_TEXT_FIELD_LINK).sendKeys(searchValue);
        waitFor(SEARCH_LINK).$(SEARCH_LINK).click();
        return switchToPage(ProductsPage.class);
    }
    //navigate to help page
    public HelpPage navigateToHelpPage(){
        waitFor(HELP_LINK).$(HELP_LINK).click();
        return switchToPage(HelpPage.class);
    }
    //click the shopping cart link
    public ProductsPage clickTheCartLink(){
        waitFor(SHOP_CHART_LINK).$(SHOP_CHART_LINK).click();
        return switchToPage(ProductsPage.class);
    }
    //select categories
    public ProductsPage navigateToProductCategoryPage(PetCategory productCategory){

        switch (productCategory){
            case FISH:
                waitFor(FISH_LINK).$(FISH_LINK).click();
                return switchToPage(ProductsPage.class);

            case CATS:
                waitFor(CATS_LINKS).$(CATS_LINKS).click();
                return switchToPage(ProductsPage.class);

            case REPTILES:
                waitFor(REPTILES_LINKS).$(REPTILES_LINKS).click();
                return switchToPage(ProductsPage.class);

            case DOGS:
            waitFor(DOGS_LINKS).$(DOGS_LINKS).click();
            return switchToPage(ProductsPage.class);

            case BIRDS:
            waitFor(BIRDS_LINKS).$(BIRDS_LINKS).click();
            return switchToPage(ProductsPage.class);

            default:
        break;
    }
    return null;
 }
}

