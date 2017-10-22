package io.github.dmitrikudrenko.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public abstract class AppiumDriverBuilder<Self, Driver extends AppiumDriver> {

    public static AndroidDriverBuilder forAndroid() {
        return new AndroidDriverBuilder();
    }

    public static class AndroidDriverBuilder extends AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver> {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        public AndroidDriver build() throws IOException {
            Properties properties = new Properties();
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("settings.properties"));
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getProperty("sdkVersion"));
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, packageName);
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, launchActivity);

            return new AndroidDriver(endpoint, capabilities);
        }
    }

    URL endpoint;
    String packageName;
    String launchActivity;

    public Self withEndpoint(URL endpoint) {
        this.endpoint = endpoint;
        return (Self) this;
    }

    public Self withPackageName(String packageName) {
        this.packageName = packageName;
        return (Self) this;
    }

    public Self withLaunchActivity(String launchActivity) {
        this.launchActivity = launchActivity;
        return (Self) this;
    }

    public abstract Driver build() throws IOException;

}
