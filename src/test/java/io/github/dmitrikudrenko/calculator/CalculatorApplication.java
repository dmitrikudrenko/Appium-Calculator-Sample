package io.github.dmitrikudrenko.calculator;

import io.appium.java_client.AppiumDriver;
import io.github.dmitrikudrenko.core.AbstractApplication;

public class CalculatorApplication extends AbstractApplication {
    public CalculatorApplication(AppiumDriver driver) {
        super(driver);
    }

    public CalculatorScreen calculatorScreen() {
        return new CalculatorScreen(driver);
    }
}
