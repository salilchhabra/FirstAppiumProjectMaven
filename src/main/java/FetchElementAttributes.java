import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By element = MobileBy.AccessibilityId("App");
        System.out.println("text:" + driver.findElement(element).getText());
        System.out.println("text:" + driver.findElement(element).getAttribute("text"));
        System.out.println("enabled:" + driver.findElement(element).getAttribute("enabled"));
        System.out.println("checked:" + driver.findElement(element).getAttribute("checked"));
        System.out.println("focused:" + driver.findElement(element).getAttribute("focused"));
        System.out.println("displayed:" + driver.findElement(element).getAttribute("displayed"));//visibility check


        System.out.println("selected:" + driver.findElement(element).isSelected());
        System.out.println("enabled:" + driver.findElement(element).isEnabled());
        System.out.println("displayed:" + driver.findElement(element).isDisplayed());
    }
}
// How to fetch element attributes?