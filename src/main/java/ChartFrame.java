import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChartFrame {


    private WebDriver driver;

    public ChartFrame(WebDriver driver) {
        this.driver = driver;
    }

    private By Month = By.cssSelector("#quotesBoxChartTimeFrames > span:nth-child(2)");
    private By Bitcoin = By.cssSelector("#QBS_3 > a");


    public ChartFrame setDay() {
        driver.findElement(Month).click();
        return this;
    }

    public ChartFrame setCur () {
        driver.findElement(Bitcoin).click();
        return this;

    }

}
