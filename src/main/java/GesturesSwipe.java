import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

class GesturesSwipe {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By grid = MobileBy.AccessibilityId("Grid");
        By animation = MobileBy.AccessibilityId("Animation");
        driver.findElement(views).click();



        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
//scroll from one coordinate  to other coordinate.
        TouchAction t = new TouchAction(driver);
        t.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
//scroll from one element location to other element loc.
       /* TouchAction t1 = new TouchAction(driver);
        t1.press(ElementOption.element(driver.findElement(grid)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(ElementOption.element(driver.findElement(animation)))
                .release()
                .perform();*/
    }
}
//TAP, PRESS, LONGPRESS, WAITACTION, RELEASE, PERFORM, MOVETO