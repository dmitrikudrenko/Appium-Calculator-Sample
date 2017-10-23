package io.github.dmitrikudrenko.calculator;

import io.appium.java_client.AppiumDriver;
import io.github.dmitrikudrenko.core.AbstractTest;
import io.github.dmitrikudrenko.core.AppiumDriverBuilder;

import java.io.IOException;

public abstract class CalculatorAbstractTest extends AbstractTest<CalculatorApplication> {
    protected CalculatorScreen calculatorScreen;

    @Override
    protected void onStart(CalculatorApplication application) {
        calculatorScreen = new CalculatorScreen(application.getDriver());
    }

    @Override
    protected CalculatorApplication create(AppiumDriver driver) {
        return new CalculatorApplication(driver);
    }

    @Override
    protected AppiumDriverBuilder.AndroidDriverBuilder createAndroidDriverBuilder() throws IOException {
        return super.createAndroidDriverBuilder()
                .withPackageName(CalculatorConstants.PACKAGE_NAME)
                .withLaunchActivity(CalculatorConstants.LAUNCH_ACTIVITY);
    }
}
