package io.github.dmitrikudrenko.calculator.operations

import io.github.dmitrikudrenko.calculator.core.CalculatorAbstractTest
import io.github.dmitrikudrenko.core.shouldClick
import org.testng.annotations.AfterMethod

abstract class AbstractOperationTest: CalculatorAbstractTest() {
    @AfterMethod
    fun `clear`() {
        calculatorScreen.clearBtn.shouldClick()
    }
}