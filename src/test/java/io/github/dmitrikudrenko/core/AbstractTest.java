package io.github.dmitrikudrenko.core;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest<Application extends AbstractApplication> {
    private Application application;

    @BeforeClass
    public void connect() throws IOException, InterruptedException {
        AppiumDriver driver = createAndroidDriverBuilder().build();

        application = create(driver);
        Sleeper.SYSTEM_SLEEPER.sleep(new Duration(1, TimeUnit.SECONDS));
        onStart(application);
    }

    @AfterClass
    public void tearDown() {
        application.getDriver().closeApp();
    }

    protected AppiumDriverBuilder.AndroidDriverBuilder createAndroidDriverBuilder() throws IOException {
        Properties properties = new Properties();
        properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("settings.properties"));
        return AppiumDriverBuilder.forAndroid()
                .withEndpoint(new URL(properties.getProperty("appiumServerUrl")));
    }

    protected abstract Application create(AppiumDriver driver);

    public Application getApplication() {
        return application;
    }

    protected void onStart(Application application) {
    }
}
