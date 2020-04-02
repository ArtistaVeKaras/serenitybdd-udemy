package jpetstore.pages.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'?')]") WebElementFacade HELP_LINK;

    public HelpPage navigateToHelpPage(){
        waitFor(HELP_LINK).click();
        return this.switchToPage(HelpPage.class);
    }
}
