import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class DifferentWaysOfDefiningElements {
    @AndroidFindBy(xpath = "//*[@text=\"Accessibility\"]")
    private static MobileElement myElement4;
    public DifferentWaysOfDefiningElements(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        DifferentWaysOfDefiningElements differentWaysOfDefiningElements = new DifferentWaysOfDefiningElements(driver);
        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Accessibility");
        System.out.println(myElement.getText());
        WebElement webElement = driver.findElementByAccessibilityId("Accessibility");
        System.out.println(webElement.getText());
        //Advantage of using BY class is to keep particular attribute at one place and use at multiple places
        By myElement2=By.xpath("//*[@text=\"Accessibility\"]");
        System.out.println(driver.findElement(myElement2).getText());
        By myElement3= MobileBy.AccessibilityId("Accessibility");
        System.out.println(driver.findElement(myElement3).getText());
        System.out.println(myElement4.getText());





    }
}
