package io.github.dmitrikudrenko.calculator.operations

import org.testng.annotations.Test

class MultiplicationOperationTest : AbstractOperationTest() {
    @Test
    fun `one multiple five should be five`() {
        calculatorScreen.inputFormula("1×5=").shouldBeResult("5")
    }

    @Test
    fun `five multiple one should be five`() {
        calculatorScreen.inputFormula("5×1=").shouldBeResult("5")
    }

    @Test
    fun `five multiple zero should be zero`() {
        calculatorScreen.inputFormula("5×0=").shouldBeResult("0")
    }

    @Test
    fun `zero multiple five should be zero`() {
        calculatorScreen.inputFormula("0×5=").shouldBeResult("0")
    }

    @Test
    fun `minus two multiple five should be minus ten`() {
        calculatorScreen.inputFormula("−2×5=").shouldBeResult("−10")
    }
}