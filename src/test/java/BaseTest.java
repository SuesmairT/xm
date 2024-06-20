import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

//Use Case:
//1. Open Home page (make any check here if needed).
//2. Click the “Trading” link located at the top menu (make any check here if needed).
//3. Click on “Stocks” (make any check here if needed).
//4. Choose the "Norway" stock filter.
//5. Get data from the table for the "Orkla ASA (ORK.OL)"  (make any check here if needed).
//6. Click on the "READ MORE" at this brand.
//7. Compare the data from the previous table with data in "Trading Conditions".
public class BaseTest {
    @BeforeEach

    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
        WebDriver driver = new ChromeDriver(options); // Set WebDriver to Selenide WebDriverRunner.setWebDriver(driver);

        open("https://www.xm.com/");
    }
    MainPage mainPage = new MainPage();
    StocksPage stocksPage= new StocksPage();
    TradingPage tradingPage = new TradingPage();
}
