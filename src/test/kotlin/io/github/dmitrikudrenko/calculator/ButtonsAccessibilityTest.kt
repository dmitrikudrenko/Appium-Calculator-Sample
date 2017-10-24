package io.github.dmitrikudrenko.calculator

import io.github.dmitrikudrenko.calculator.core.CalculatorAbstractTest
import io.github.dmitrikudrenko.core.shouldBeDisplayedAndEnabled
import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class ButtonsAccessibilityTest : CalculatorAbstractTest() {
    @Test(groups = arrayOf("digits_accessibility"))
    fun zeroDigitTest() {
        calculatorScreen?.zeroBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("0")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun oneDigitTest() {
        calculatorScreen?.oneBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("1")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun twoDigitTest() {
        calculatorScreen?.twoBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("2")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun threeDigitTest() {
        calculatorScreen?.threeBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("3")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun fourDigitTest() {
        calculatorScreen?.fourBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("4")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun fiveDigitTest() {
        calculatorScreen?.fiveBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("5")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun sixDigitTest() {
        calculatorScreen?.sixBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("6")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun sevenDigitTest() {
        calculatorScreen?.sevenBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("7")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun eightDigitTest() {
        calculatorScreen?.eightBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("8")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun nineDigitTest() {
        calculatorScreen?.nineBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("9")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun plusTest() {
        calculatorScreen?.plusBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("+")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun minusTest() {
        calculatorScreen?.minusBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("−")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun divideTest() {
        calculatorScreen?.divideBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("÷")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun multipleTest() {
        calculatorScreen?.multipleBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("×")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun equalsTest() {
        calculatorScreen?.equalsBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("=")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun decimalPointTest() {
        calculatorScreen?.decimalPointBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText(".")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun deleteTest() {
        calculatorScreen?.deleteBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("DEL")
    }
}
