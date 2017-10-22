package io.github.dmitrikudrenko.calculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.github.dmitrikudrenko.core.AbstractScreen;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class CalculatorScreen extends AbstractScreen {
    @AndroidFindBy(id = CalculatorConstants.ID + "digit_0")
    private MobileElement zeroBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_4")
    private MobileElement fourBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_5")
    private MobileElement fiveBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_add")
    private MobileElement plusBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_div")
    private MobileElement divBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "eq")
    private MobileElement equalsBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "result")
    private MobileElement resultField;

    public CalculatorScreen(AppiumDriver driver) {
        super(driver);
    }

    public String getResult(String result) {
        try {
            (new WebDriverWait(driver, 5))
                    .until(ExpectedConditions.textToBePresentInElement(resultField, result));
        } catch (TimeoutException ignored) {
        }
        return resultField.getText();
    }

    public MobileElement getZeroBtn() {
        return zeroBtn;
    }

    public MobileElement getFourBtn() {
        return fourBtn;
    }

    public MobileElement getFiveBtn() {
        return fiveBtn;
    }

    public MobileElement getPlusBtn() {
        return plusBtn;
    }

    public MobileElement getDivBtn() {
        return divBtn;
    }

    public MobileElement getEqualsBtn() {
        return equalsBtn;
    }
}
