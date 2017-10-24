package io.github.dmitrikudrenko.calculator.operations

import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class MultiplicationOperationTest : AbstractOperationTest() {
    @Test
    fun `one multiple five should be five`() {
        calculatorScreen?.inputFormula("1×5=")
        calculatorScreen?.resultField?.shouldHaveText("5")
    }

    @Test
    fun `five multiple one should be five`() {
        calculatorScreen?.inputFormula("5×1=")
        calculatorScreen?.resultField?.shouldHaveText("5")
    }

    @Test
    fun `five multiple zero should be zero`() {
        calculatorScreen?.inputFormula("5×0=")
        calculatorScreen?.resultField?.shouldHaveText("0")
    }

    @Test
    fun `zero multiple five should be zero`() {
        calculatorScreen?.inputFormula("0×5=")
        calculatorScreen?.resultField?.shouldHaveText("0")
    }

    @Test
    fun `minus two multiple five should be minus ten`() {
        calculatorScreen?.inputFormula("−2×5=")
        calculatorScreen?.resultField?.shouldHaveText("−10")
    }
}