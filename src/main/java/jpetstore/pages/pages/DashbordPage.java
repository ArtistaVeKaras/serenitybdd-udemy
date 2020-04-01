package jpetstore.pages.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class DashbordPage extends BasePage{


    public static @FindBy(xpath = "//div[@id='Content']//a[2]//img[1]") WebElementFacade FISH_LINK;
    public static @FindBy(xpath = "//div[@id='Content']//a[2]//img[1]") WebElementFacade DOGS_LINK;
    public static @FindBy(xpath = "//div[@id='Content']//a[3]//img[1]") WebElementFacade CATS_LINK;
    public static @FindBy(xpath = "//div[@id='Content']//a[4]//img[1]") WebElementFacade REPTILES_LINK;
    public static @FindBy(xpath = "//div[@id='Content']//a[5]//img[1]") WebElementFacade BIRDS_LINK;
    public static final String GET_GREETINGS_MESSAGE = "//div[@id='WelcomeContent']";

    public String getGreetingMessage(){
      return   waitFor(GET_GREETINGS_MESSAGE).$(GET_GREETINGS_MESSAGE).getText();

    }

    public ProductsPage selectProductFromTheSideMenuBar(PetCategory petCategory){

        switch (petCategory) {
            case FISH:
                $(FISH_LINK).click();
                return this.switchToPage(ProductsPage.class);

            case DOGS:
                $(DOGS_LINK).click();
                return this.switchToPage(ProductsPage.class);
            case CATS:

                $(CATS_LINK).click();
                return this.switchToPage(ProductsPage.class);

            case BIRDS:
                $(BIRDS_LINK).click();
                return this.switchToPage(ProductsPage.class);
            case REPTILES:
                $(REPTILES_LINK).click();
                return this.switchToPage(ProductsPage.class);

            default:
            break;
        }
        return null;
    }
}
