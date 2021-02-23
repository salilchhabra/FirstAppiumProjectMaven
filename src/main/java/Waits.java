import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By app = MobileBy.AccessibilityId("App");
        By alertDialogs = MobileBy.AccessibilityId("Alert Dialogs");
        By listDialog = MobileBy.AccessibilityId("List dialog");
//        driver.findElement(app).click();
//        driver.findElement(alertDialogs).click();
//        driver.findElement(listDialog).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(app)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(alertDialogs)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(listDialog)).click();



// why not to use both implicit and explicit wait !!!???
    }
}
