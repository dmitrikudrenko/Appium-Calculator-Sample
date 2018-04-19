package io.github.dmitrikudrenko.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.IOException
import java.net.URL
import java.util.*

abstract class AppiumDriverBuilder<out Self, out Driver : AppiumDriver<WebElement>> {

    class AndroidDriverBuilder : AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver<WebElement>>() {

        private var capabilities = DesiredCapabilities()

        @Throws(IOException::class)
        override fun build(): AndroidDriver<WebElement> {
            val properties = Properties()
            properties.load(Thread.currentThread().contextClassLoader.getResourceAsStream("settings.properties"))
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getProperty("sdkVersion"))
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device")

            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, packageName)
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, launchActivity)

            return AndroidDriver(endpoint, capabilities)
        }
    }

    var endpoint: URL? = null
    var packageName: String? = null
    var launchActivity: String? = null

    fun withEndpoint(endpoint: URL): Self {
        this.endpoint = endpoint
        return this as Self
    }

    fun withPackageName(packageName: String): Self {
        this.packageName = packageName
        return this as Self
    }

    fun withLaunchActivity(launchActivity: String): Self {
        this.launchActivity = launchActivity
        return this as Self
    }

    @Throws(IOException::class)
    abstract fun build(): Driver

    companion object {

        fun forAndroid(): AndroidDriverBuilder {
            return AndroidDriverBuilder()
        }
    }

}
