package io.github.dmitrikudrenko.calculator.core

import io.appium.java_client.AppiumDriver
import io.github.dmitrikudrenko.core.AbstractApplication

class CalculatorApplication(driver: AppiumDriver<*>) : AbstractApplication(driver) {

    fun calculatorScreen(): CalculatorScreen {
        return CalculatorScreen(driver)
    }
}
