package io.github.dmitrikudrenko.calculator.tests;

import io.appium.java_client.MobileElement;
import io.github.dmitrikudrenko.calculator.CalculatorAbstractTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ButtonsAccesibilityTest extends CalculatorAbstractTest {
    @Test(groups = "digits_accessibility")
    public void zeroDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getZeroBtn());
    }

    @Test(groups = "digits_accessibility")
    public void oneDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getOneBtn());
    }

    @Test(groups = "digits_accessibility")
    public void twoDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getTwoBtn());
    }

    @Test(groups = "digits_accessibility")
    public void threeDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getThreeBtn());
    }

    @Test(groups = "digits_accessibility")
    public void fourDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getFourBtn());
    }

    @Test(groups = "digits_accessibility")
    public void fiveDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getFiveBtn());
    }

    @Test(groups = "digits_accessibility")
    public void sixDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getSixBtn());
    }

    @Test(groups = "digits_accessibility")
    public void sevenDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getSevenBtn());
    }

    @Test(groups = "digits_accessibility")
    public void eightDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getEightBtn());
    }

    @Test(groups = "digits_accessibility")
    public void nineDigitTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getNineBtn());
    }

    @Test(groups = "operations_accessibility", dependsOnGroups = "digits_accessibility")
    public void plusTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getPlusBtn());
    }

    @Test(groups = "operations_accessibility", dependsOnGroups = "digits_accessibility")
    public void minusTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getMinusBtn());
    }

    @Test(groups = "operations_accessibility", dependsOnGroups = "digits_accessibility")
    public void divideTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getDivideBtn());
    }

    @Test(groups = "operations_accessibility", dependsOnGroups = "digits_accessibility")
    public void multipleTest() {
        checkDigitDisplayedAndEnabled(calculatorScreen.getMultipleBtn());
    }

    private void checkDigitDisplayedAndEnabled(MobileElement digit) {
        assertTrue(digit.isDisplayed());
        assertTrue(digit.isEnabled());
    }

    private void checkElementCaption(MobileElement element, String caption) {
        assertEquals(element.getText(), caption, "Element " + element.getId() +
                "should has title " + caption);
    }
}
