package io.github.dmitrikudrenko.calculator

import io.github.dmitrikudrenko.calculator.core.CalculatorAbstractTest
import io.github.dmitrikudrenko.core.shouldBeDisplayedAndEnabled
import io.github.dmitrikudrenko.core.shouldHaveText
import io.github.dmitrikudrenko.core.shouldNotBeDisplayed
import org.testng.annotations.Test

class ButtonsAccessibilityTest : CalculatorAbstractTest() {
    @Test(groups = arrayOf("digits_accessibility"))
    fun `zero button should be displayed and enabled`() {
        calculatorScreen?.zeroBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("0")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `one button should be displayed and enabled`() {
        calculatorScreen?.oneBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("1")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `two button should be displayed and enabled`() {
        calculatorScreen?.twoBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("2")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `three button should be displayed and enabled`() {
        calculatorScreen?.threeBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("3")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `four button should be displayed and enabled`() {
        calculatorScreen?.fourBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("4")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `five button should be displayed and enabled`() {
        calculatorScreen?.fiveBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("5")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `six button should be displayed and enabled`() {
        calculatorScreen?.sixBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("6")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `seven button should be displayed and enabled`() {
        calculatorScreen?.sevenBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("7")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `eight button should be displayed and enabled`() {
        calculatorScreen?.eightBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("8")
    }

    @Test(groups = arrayOf("digits_accessibility"))
    fun `nine button should be displayed and enabled`() {
        calculatorScreen?.nineBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("9")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `plus button should be displayed and enabled`() {
        calculatorScreen?.plusBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("+")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `minus button should be displayed and enabled`() {
        calculatorScreen?.minusBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("−")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `divide button should be displayed and enabled`() {
        calculatorScreen?.divideBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("÷")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `multiple button should be displayed and enabled`() {
        calculatorScreen?.multipleBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("×")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `equals button should be displayed and enabled`() {
        calculatorScreen?.equalsBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("=")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `decimal point button should be displayed and enabled`() {
        calculatorScreen?.decimalPointBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText(".")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `delete button should be displayed and enabled`() {
        calculatorScreen?.deleteBtn
                ?.shouldBeDisplayedAndEnabled()
                ?.shouldHaveText("DEL")
    }

    @Test(groups = arrayOf("operations_accessibility"), dependsOnGroups = arrayOf("digits_accessibility"))
    fun `clear button should not be displayed`() {
        calculatorScreen?.clearBtn
                ?.shouldNotBeDisplayed()
    }
}
