package io.github.dmitrikudrenko.calculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.github.dmitrikudrenko.core.AbstractScreen;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorScreen extends AbstractScreen {
    @AndroidFindBy(id = CalculatorConstants.ID + "digit_0")
    private MobileElement zeroBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_1")
    private MobileElement oneBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_2")
    private MobileElement twoBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_3")
    private MobileElement threeBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_4")
    private MobileElement fourBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_5")
    private MobileElement fiveBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_6")
    private MobileElement sixBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_7")
    private MobileElement sevenBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_8")
    private MobileElement eightBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_9")
    private MobileElement nineBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_add")
    private MobileElement plusBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_sub")
    private MobileElement minusBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_div")
    private MobileElement divideBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "op_mul")
    private MobileElement multipleBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "eq")
    private MobileElement equalsBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "dec_point")
    private MobileElement decimalPointBtn;

    @AndroidFindBy(id = CalculatorConstants.ID + "result")
    private MobileElement resultField;

    @AndroidFindBy(id = CalculatorConstants.ID + "formula")
    private MobileElement formulaField;

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

    public MobileElement getOneBtn() {
        return oneBtn;
    }

    public MobileElement getTwoBtn() {
        return twoBtn;
    }

    public MobileElement getThreeBtn() {
        return threeBtn;
    }

    public MobileElement getFourBtn() {
        return fourBtn;
    }

    public MobileElement getFiveBtn() {
        return fiveBtn;
    }

    public MobileElement getSixBtn() {
        return sixBtn;
    }

    public MobileElement getSevenBtn() {
        return sevenBtn;
    }

    public MobileElement getEightBtn() {
        return eightBtn;
    }

    public MobileElement getNineBtn() {
        return nineBtn;
    }

    public MobileElement getPlusBtn() {
        return plusBtn;
    }

    public MobileElement getMinusBtn() {
        return minusBtn;
    }

    public MobileElement getDivideBtn() {
        return divideBtn;
    }

    public MobileElement getMultipleBtn() {
        return multipleBtn;
    }

    public MobileElement getEqualsBtn() {
        return equalsBtn;
    }

    public MobileElement getDecimalPointBtn() {
        return decimalPointBtn;
    }
}
