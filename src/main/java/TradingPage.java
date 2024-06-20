import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class TradingPage {
    private SelenideElement tradingPage = $(byCssSelector("[class=\"main_nav_trading selected\"]"));

    //[class="menu-stocks"] [href="https://www.xm.com/stocks"] у меня с таким как у всех не прошло
    private SelenideElement stocksLink = $(byCssSelector("[class=\"menu-stocks\"] [href=\"https://www.xm.com/stocks\"]"));
    private SelenideElement stickyMenu = $(byCssSelector("[class=\"sticky-bar active\"] [class=\"fa fa-times\"]"));


    public void successTradingPage(String expectedText){
        tradingPage.shouldHave(text(expectedText));
    }

    public void clickOnStocksLink(){
        stocksLink.shouldBe(Condition.visible).click();
        //!!! это я сама сюда добавила (на эту стр) stickyMenu.shouldBe(visible).click();
    }


}
