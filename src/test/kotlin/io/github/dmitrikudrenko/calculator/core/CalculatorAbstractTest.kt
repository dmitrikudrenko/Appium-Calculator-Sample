package io.github.dmitrikudrenko.calculator.core

import io.appium.java_client.AppiumDriver
import io.github.dmitrikudrenko.core.AbstractTest
import io.github.dmitrikudrenko.core.AppiumDriverBuilder

import java.io.IOException

abstract class CalculatorAbstractTest : AbstractTest<CalculatorApplication>() {
    protected lateinit var calculatorScreen: CalculatorScreen

    override fun onStart(application: CalculatorApplication) {
        calculatorScreen = application.calculatorScreen()
    }

    override fun create(driver: AppiumDriver<*>): CalculatorApplication {
        return CalculatorApplication(driver)
    }

    @Throws(IOException::class)
    override fun createAndroidDriverBuilder(): AppiumDriverBuilder.AndroidDriverBuilder {
        return super.createAndroidDriverBuilder()
                .withPackageName(CalculatorConstants.PACKAGE_NAME)
                .withLaunchActivity(CalculatorConstants.LAUNCH_ACTIVITY)
    }
}
