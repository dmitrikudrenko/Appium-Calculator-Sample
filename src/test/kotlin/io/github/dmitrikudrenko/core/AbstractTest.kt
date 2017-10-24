package io.github.dmitrikudrenko.core

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.support.ui.Duration
import org.openqa.selenium.support.ui.Sleeper
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import java.io.IOException
import java.net.URL
import java.util.*
import java.util.concurrent.TimeUnit

abstract class AbstractTest<Application : AbstractApplication> {
    var application: Application? = null
        private set

    @BeforeClass
    @Throws(IOException::class, InterruptedException::class)
    fun connect() {
        val driver = createAndroidDriverBuilder().build()

        application = create(driver)
        Sleeper.SYSTEM_SLEEPER.sleep(Duration(1, TimeUnit.SECONDS))
        onStart(application)
    }

    @AfterClass
    fun tearDown() {
        application?.driver?.closeApp()
    }

    @Throws(IOException::class)
    protected open fun createAndroidDriverBuilder(): AppiumDriverBuilder.AndroidDriverBuilder {
        val properties = Properties()
        properties.load(Thread.currentThread().contextClassLoader.getResourceAsStream("settings.properties"))
        return AppiumDriverBuilder.forAndroid()
                .withEndpoint(URL(properties.getProperty("appiumServerUrl")))
    }

    protected abstract fun create(driver: AppiumDriver<*>): Application

    protected open fun onStart(application: Application?) {}
}
