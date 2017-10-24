package io.github.dmitrikudrenko.calculator

import io.github.dmitrikudrenko.calculator.core.CalculatorAbstractTest
import io.github.dmitrikudrenko.core.shouldClick
import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class ButtonsClickTest : CalculatorAbstractTest() {
    @Test(groups = arrayOf("single_tap"))
    fun zeroDigitClick() {
        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("0")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun oneDigitClick() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("1")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun twoDigitClick() {
        calculatorScreen?.twoBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("2")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun threeDigitClick() {
        calculatorScreen?.threeBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("3")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun fourDigitClick() {
        calculatorScreen?.fourBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("4")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun fiveDigitClick() {
        calculatorScreen?.fiveBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("5")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun sixDigitClick() {
        calculatorScreen?.sixBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("6")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun sevenDigitClick() {
        calculatorScreen?.sevenBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("7")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun eightDigitClick() {
        calculatorScreen?.eightBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("8")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("single_tap"))
    fun nineDigitClick() {
        calculatorScreen?.nineBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("9")

        calculatorScreen?.deleteBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("")
    }

    @Test(groups = arrayOf("complex_tap"), dependsOnGroups = arrayOf("single_tap"))
    fun complexClickTest() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("1")

        calculatorScreen?.twoBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("12")

        calculatorScreen?.threeBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("123")

        calculatorScreen?.fourBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("1234")

        calculatorScreen?.fiveBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("12345")

        calculatorScreen?.sixBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("123456")

        calculatorScreen?.sevenBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("1234567")

        calculatorScreen?.eightBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("12345678")

        calculatorScreen?.nineBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("123456789")

        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.formulaField?.shouldHaveText("1234567890")
    }
}