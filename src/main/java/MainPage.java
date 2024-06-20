import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement acceptAllButtonPopup =$(byCssSelector("[class=\"btn btn-block btn-red btn-solid js-acceptDefaultCookie gtm-acceptDefaultCookieFirstVisit\"]"));

    //[class ="main_nav_trading"]
    private SelenideElement tradingButton =$(byCssSelector("[class =\"main_nav_trading\"]"));

    public void clickOnAcceptAllButton(){
        acceptAllButtonPopup.click();
    }

    public void clicktradingLink(){
        tradingButton.click();
    }

}
