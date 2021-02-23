import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static AppiumDriver initializeDriver(String platformName) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme 2 Pro");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability(MobileCapabilityType.UDID, "8c7ed88a");
//        caps.setCapability("appPackage", "io.appium.android.apis");
//        caps.setCapability("appActivity", "io.appium.android.apis.view.Animation2");
//        caps.setCapability("avd", "Pixel_2_API_27");
        caps.setCapability("avdLaunchTimeout", 180000);
        caps.setCapability("newCommandTimeout", 300);
        caps.setCapability("unlockType", "pattern");
        caps.setCapability("unlockKey", "14789");



        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
//        caps.setCapability(MobileCapabilityType.APP,"/Users/salilchhabra/IdeaProjects/FirstAppiumProjectMaven/src/main/resources/ApiDemos-debug.apk");
        caps.setCapability(MobileCapabilityType.APP, appUrl);
//        start appium server
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        //To create new driver session, we need to create appiumdriver object
        AppiumDriver driver = new AndroidDriver(url, caps);
        return driver;
    }
}
