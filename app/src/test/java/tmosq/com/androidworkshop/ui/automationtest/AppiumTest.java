package tmosq.com.androidworkshop.ui.automationtest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
    protected AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        File appDir = new File("/Users/tmosq/Projects/AndroidWorkshop/app/build/outputs/apk");
        File app = new File(appDir, "app-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void runTest() throws Exception {

    }
}
