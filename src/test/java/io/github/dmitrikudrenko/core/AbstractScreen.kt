package io.github.dmitrikudrenko.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.NoSuchElementException

abstract class AbstractScreen(private val driver: AppiumDriver<*>) {
    fun findElementById(id: String): MobileElement? {
        try {
            return driver.findElementById(id) as MobileElement?
        } catch (e: NoSuchElementException) {
            return null
        }
    }
}
