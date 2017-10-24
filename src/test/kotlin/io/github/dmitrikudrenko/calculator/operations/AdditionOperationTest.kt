package io.github.dmitrikudrenko.calculator.operations

import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class AdditionOperationTest : AbstractOperationTest() {
    @Test
    fun `one plus one should be two`() {
        calculatorScreen?.inputFormula("1+1=")
        calculatorScreen?.resultField?.shouldHaveText("2")
    }

    @Test
    fun `zero plus one should be one`() {
        calculatorScreen?.inputFormula("0+1=")
        calculatorScreen?.resultField?.shouldHaveText("1")
    }

    @Test
    fun `one plus zero should be one`() {
        calculatorScreen?.inputFormula("1+0=")
        calculatorScreen?.resultField?.shouldHaveText("1")
    }

    @Test
    fun `five plus six should be eleven`() {
        calculatorScreen?.inputFormula("5+6=")
        calculatorScreen?.resultField?.shouldHaveText("11")
    }

    @Test
    fun `six plus five should be eleven`() {
        calculatorScreen?.inputFormula("6+5=")
        calculatorScreen?.resultField?.shouldHaveText("11")
    }
}