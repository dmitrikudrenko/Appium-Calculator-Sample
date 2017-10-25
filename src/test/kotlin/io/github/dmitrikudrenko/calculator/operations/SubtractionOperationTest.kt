package io.github.dmitrikudrenko.calculator.operations

import org.testng.annotations.Test

class SubtractionOperationTest : AbstractOperationTest() {
    @Test
    fun `eleven minus five should be six`() {
        calculatorScreen?.inputFormula("11−5=")?.shouldBeResult("6")
    }

    @Test
    fun `one minus zero should be one`() {
        calculatorScreen?.inputFormula("1−0=")?.shouldBeResult("1")
    }

    @Test
    fun `one minus one should be zero`() {
        calculatorScreen?.inputFormula("1−1=")?.shouldBeResult("0")
    }

    @Test
    fun `zero minus one should be minus one`() {
        calculatorScreen?.inputFormula("0−1=")?.shouldBeResult("−1")
    }
}