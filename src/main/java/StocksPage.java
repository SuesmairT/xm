import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class StocksPage {

    private SelenideElement successStocksButton = $("[class=\"active\"] [href=\"https://www.xm.com/stocks\"]");


    //[data-value="Norway"]
    //$(byCssSelector("[class =\"main_nav_trading\"]"));
    private SelenideElement norwayFilterButton = $(byCssSelector("[class=\"table-country-filter\"] [data-value=\"Norway\"]"));

 //[class=\"sticky-bar active\"] [class=\"fa fa-times\"]
    private SelenideElement stickyMenu = $(byCssSelector("[class=\"sticky-bar active\"] [class=\"fa fa-times\"]"));


    private SelenideElement pageTwo = $(byCssSelector("#DataTables_Table_0_paginate [data-dt-idx=\"2\"]"));

    private SelenideElement search = $("[type=\"search\"]");


    private SelenideElement valueOrkla = $("[data-xm-qa-name=\"minSpread\"]");


    public void successTradingPage(){
        successStocksButton.shouldBe(visible);
    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }
    //norwayFilter
    public void chooseFilterNorway(){
        scrollToElement(norwayFilterButton);
        norwayFilterButton.shouldBe(visible);
        norwayFilterButton.scrollIntoView(true);
        try {
            norwayFilterButton.shouldBe(Condition.interactable, Duration.ofMillis(200));

        }catch (ElementClickInterceptedException e) {
            stickyMenu.click();
            sleep(2000);
            norwayFilterButton.click();
        }
    }

    //page2
   // public void clickPage2(){
     //   pageTwo.click();
    //}

    //search
    public void searchValue(){
        search.setValue("ORK.OL");
    }

    //valueOrkla
    public void orklaMinSpread(String expectedValue){
        scrollToElement(valueOrkla);
       //valueOrkla.getText();
       valueOrkla.shouldHave(Condition.text(expectedValue));

    }
}