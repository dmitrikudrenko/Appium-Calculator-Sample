package io.github.dmitrikudrenko.core;

import io.appium.java_client.AppiumDriver;

public abstract class AbstractApplication {
    protected final AppiumDriver driver;

    public AbstractApplication(AppiumDriver driver) {
        this.driver = driver;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
