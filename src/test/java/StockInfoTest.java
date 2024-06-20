import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockInfoTest extends BaseTest {
//1. Open Home page (make any check here if needed).
//            2. Click the “Trading” link located at the top menu (make any check here if needed).
//            3. Click on “Stock CFDs” (make any check here if needed).
//            4. Choose the "Norway" stock filter.
//            5. Get data from the table for the "Orkla ASA (ORK.OL)"  (make any check here if needed).
//            6. Click on the "READ MORE" at this brand.
//7. Compare the data from the previous table with data in "Trading Conditions".
    @Test
    public void orlaNorwayInfoTest() {
        mainPage.clickOnAcceptAllButton();
        sleep(2000);
        mainPage.clicktradingLink();
        tradingPage.clickOnStocksLink();
        //Selenide.sleep(3000);
        stocksPage.successTradingPage();
    }

        @Test
    // 4. Choose the "Norway" stock filter.
        public void chooseTheNorwayStockFilter() {
            mainPage.clickOnAcceptAllButton();
            mainPage.clicktradingLink();
            tradingPage.clickOnStocksLink();
            stocksPage.chooseFilterNorway();

    }

    @Test

    //5. Get data from the table for the "Orkla ASA (ORK.OL)"  (make any check here if needed).
//clickPage2
    public void getDataTableOrklaASA () {
        mainPage.clickOnAcceptAllButton();
        mainPage.clicktradingLink();
        tradingPage.clickOnStocksLink();
        stocksPage.chooseFilterNorway();
        stocksPage.searchValue();
        stocksPage.orklaMinSpread("1.115");
    }
}
