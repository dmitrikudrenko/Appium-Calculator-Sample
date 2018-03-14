package io.github.dmitrikudrenko.calculator

import io.github.dmitrikudrenko.calculator.core.CalculatorAbstractTest
import io.github.dmitrikudrenko.core.shouldClick
import io.github.dmitrikudrenko.core.shouldHaveText
import io.github.dmitrikudrenko.core.shouldLongClick
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

class ButtonsClickTest : CalculatorAbstractTest() {
    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 0 after zero button click`() {
        calculatorScreen.zeroBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("0")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 1 after one button click`() {
        calculatorScreen.oneBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("1")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 2 after two button click`() {
        calculatorScreen.twoBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("2")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 3 after three button click`() {
        calculatorScreen.threeBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("3")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 4 after four button click`() {
        calculatorScreen.fourBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("4")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 5 after five button click`() {
        calculatorScreen.fiveBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("5")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 6 after six button click`() {
        calculatorScreen.sixBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("6")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 7 after seven button click`() {
        calculatorScreen.sevenBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("7")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 8 after eight button click`() {
        calculatorScreen.eightBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("8")
    }

    @Test(groups = arrayOf("single_tap"))
    fun `formula should contain 9 after nine button click`() {
        calculatorScreen.nineBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("9")
    }

    @Test(groups = arrayOf("complex_tap"), dependsOnGroups = arrayOf("single_tap"))
    fun `formula should contain data that user inputed`() {
        calculatorScreen.oneBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("1")

        calculatorScreen.twoBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("12")

        calculatorScreen.threeBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("123")

        calculatorScreen.fourBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("1234")

        calculatorScreen.fiveBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("12345")

        calculatorScreen.sixBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("123456")

        calculatorScreen.sevenBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("1234567")

        calculatorScreen.eightBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("12345678")

        calculatorScreen.nineBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("123456789")

        calculatorScreen.zeroBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("1234567890")
    }

    @AfterMethod(groups = arrayOf("single_tap"))
    fun `clear`() {
        calculatorScreen.deleteBtn.shouldClick()
        calculatorScreen.formulaField.shouldHaveText("")
    }

    @AfterMethod(groups = arrayOf("complex_tap"))
    fun `clear all`() {
        calculatorScreen.deleteBtn.shouldLongClick()
        calculatorScreen.formulaField.shouldHaveText("")
    }
}