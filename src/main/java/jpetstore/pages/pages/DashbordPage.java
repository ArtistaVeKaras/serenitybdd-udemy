package jpetstore.pages.pages;

public class DashbordPage extends BasePage{

    public static final String GET_GREETINGS_MESSAGE = "//div[@id='WelcomeContent']";

    public String getGreetingMessage(){
      return   waitFor(GET_GREETINGS_MESSAGE).$(GET_GREETINGS_MESSAGE).getText();
    }
}
