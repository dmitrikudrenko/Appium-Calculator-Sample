package io.github.dmitrikudrenko.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

abstract class AbstractScreen(private val driver: AppiumDriver<*>) {
    fun findElementById(id: String) = driver.findElementById(id) as MobileElement?
}
