package io.github.dmitrikudrenko.calculator.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.github.dmitrikudrenko.core.AbstractScreen
import io.github.dmitrikudrenko.core.bindOptionalElement
import io.github.dmitrikudrenko.core.shouldClick
import io.github.dmitrikudrenko.core.shouldHaveText

class CalculatorScreen(driver: AppiumDriver<*>) : AbstractScreen(driver) {
    val zeroBtn: MobileElement? by bindOptionalElement(constants.id + "digit_0")

    val oneBtn: MobileElement? by bindOptionalElement(constants.id + "digit_1")

    val twoBtn: MobileElement? by bindOptionalElement(constants.id + "digit_2")

    val threeBtn: MobileElement? by bindOptionalElement(constants.id + "digit_3")

    val fourBtn: MobileElement? by bindOptionalElement(constants.id + "digit_4")

    val fiveBtn: MobileElement? by bindOptionalElement(constants.id + "digit_5")

    val sixBtn: MobileElement? by bindOptionalElement(constants.id + "digit_6")

    val sevenBtn: MobileElement? by bindOptionalElement(constants.id + "digit_7")

    val eightBtn: MobileElement? by bindOptionalElement(constants.id + "digit_8")

    val nineBtn: MobileElement? by bindOptionalElement(constants.id + "digit_9")

    val plusBtn: MobileElement? by bindOptionalElement(constants.id + "op_add")

    val minusBtn: MobileElement? by bindOptionalElement(constants.id + "op_sub")

    val divideBtn: MobileElement? by bindOptionalElement(constants.id + "op_div")

    val multipleBtn: MobileElement? by bindOptionalElement(constants.id + "op_mul")

    val equalsBtn: MobileElement? by bindOptionalElement(constants.id + "eq")

    val decimalPointBtn: MobileElement? by bindOptionalElement(constants.id + "dec_point")

    val deleteBtn: MobileElement? by bindOptionalElement(constants.id + "del")

    val clearBtn: MobileElement? by bindOptionalElement(constants.id + "clr")

    val resultField: MobileElement? by bindOptionalElement(constants.id + "result")

    val formulaField: MobileElement? by bindOptionalElement(constants.id + "formula")

    fun inputFormula(formula: String): CalculatorScreen {
        for (digit in formula.toCharArray()) {
            when (digit) {
                '0' -> zeroBtn.shouldClick()
                '1' -> oneBtn.shouldClick()
                '2' -> twoBtn.shouldClick()
                '3' -> threeBtn.shouldClick()
                '4' -> fourBtn.shouldClick()
                '5' -> fiveBtn.shouldClick()
                '6' -> sixBtn.shouldClick()
                '7' -> sevenBtn.shouldClick()
                '8' -> eightBtn.shouldClick()
                '9' -> nineBtn.shouldClick()
                '+' -> plusBtn.shouldClick()
                '−' -> minusBtn.shouldClick()
                '×' -> multipleBtn.shouldClick()
                '÷' -> divideBtn.shouldClick()
                '=' -> equalsBtn.shouldClick()
            }
        }
        return this
    }

    fun shouldBeResult(result: String): CalculatorScreen {
        resultField.shouldHaveText(result)
        return this
    }
}
