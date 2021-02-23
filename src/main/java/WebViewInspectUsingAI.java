import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebViewInspectUsingAI {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(MobileBy.AccessibilityId("Views")).click();

        Dimension size = driver.manage().window().getSize();

        for(int i=0;i<4;i++){
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();
        }
        driver.findElement(MobileBy.AccessibilityId("WebView")).click();
        Thread.sleep(2000);
        By text=MobileBy.xpath("//android.webkit.WebView/android.view.View[4]/android.view.View/android.widget.EditText");
        System.out.println(driver.findElement(text).getText());
        driver.findElement(text).clear();
        driver.findElement(text).sendKeys("salil");
        System.out.println(driver.findElement(text).getText());

    }
}
