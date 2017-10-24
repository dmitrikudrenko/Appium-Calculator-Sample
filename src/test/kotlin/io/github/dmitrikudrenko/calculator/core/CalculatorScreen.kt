package io.github.dmitrikudrenko.calculator.core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.github.dmitrikudrenko.core.AbstractScreen

class CalculatorScreen(driver: AppiumDriver<*>) : AbstractScreen(driver) {
    @AndroidFindBy(id = CalculatorConstants.ID + "digit_0")
    val zeroBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_1")
    val oneBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_2")
    val twoBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_3")
    val threeBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_4")
    val fourBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_5")
    val fiveBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_6")
    val sixBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_7")
    val sevenBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_8")
    val eightBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "digit_9")
    val nineBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "op_add")
    val plusBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "op_sub")
    val minusBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "op_div")
    val divideBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "op_mul")
    val multipleBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "eq")
    val equalsBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "dec_point")
    val decimalPointBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "del")
    val deleteBtn: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "result")
    val resultField: MobileElement? = null

    @AndroidFindBy(id = CalculatorConstants.ID + "formula")
    val formulaField: MobileElement? = null
}