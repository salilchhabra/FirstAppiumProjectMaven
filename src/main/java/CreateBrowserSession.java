import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class CreateBrowserSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        //     caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme 2 Pro");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability(MobileCapabilityType.UDID, "8c7ed88a");
        caps.setCapability("noReset",true);

        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //         caps.setCapability("chromedriverExecutable", "/Users/Om/Downloads/chromedriver");
//        caps.setCapability("chromedriverExecutableDir", "/Users/Om/Downloads/ChromeDriverDir");
        return new AndroidDriver(url, caps);

    }

}
