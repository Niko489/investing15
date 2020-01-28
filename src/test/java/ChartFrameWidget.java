import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ChartFrameWidget {

    WebDriver driver;
    ChartFrame page;


    @Before
    public void SetUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.investing.com");
    }

    @Test
    public void chooseMonth() {
        page = new ChartFrame(driver);
        page.setDay();
        Assert.assertTrue(" \tS&P 500 Futures\t3,290.62\t-35.38\t-1.06%\t\t \n" +
                " \tNasdaq Futures\t9,136.62\t-111.63\t-1.21%\t\t \n" +
                " \tDow 30\t28,989.73\t-170.36\t-0.58%\t\t \n" +
                " \tS&P 500\t3,295.47\t-30.07\t-0.90%\t\t \n" +
                " \tNasdaq\t9,314.91\t-87.57\t-0.93%\t\t \n" +
                " \tS&P 500 VIX\t14.56\t+1.58\t+12.17%\t\t \n" +
                " \tDollar Index\t97.688\t+0.204\t+0.21%\t", true);
    }

    @Test
    public void Commodities () {
        page = new ChartFrame(driver);
        page.setCur();
        Assert.assertTrue("Crude Oil WTI\t54.20\t-1.39\t-2.50%\t\t \n" +
                " \tBrent Oil\t60.62\t-1.42\t-2.29%\t\t \n" +
                " \tNatural Gas\t1.888\t-0.038\t-1.97%\t\t \n" +
                " \tGold\t1,571.10\t+5.70\t+0.36%\t\t \n" +
                " \tSilver\t18.115\t+0.286\t+1.60%\t\t \n" +
                " \tCopper\t2.683\t-0.043\t-1.58%\t\t \n" +
                " \tUS Soybeans\t902.12\t-6.88\t-0.76%" , true);

    }

    @After
    public void quit () {
        driver.quit();
    }
}

