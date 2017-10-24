package io.github.dmitrikudrenko.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

abstract class AbstractScreen(protected val driver: AppiumDriver<*>) {
    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }
}
