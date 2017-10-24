package io.github.dmitrikudrenko.calculator.operations

import io.github.dmitrikudrenko.core.shouldClick
import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class SubtractionOperationTest : AbstractOperationTest() {
    @Test
    fun `eleven minus five should be six`() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.minusBtn?.shouldClick()
        calculatorScreen?.fiveBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("6")
    }

    @Test
    fun `one minus zero should be one`() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.minusBtn?.shouldClick()
        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("1")
    }

    @Test
    fun `one minus one should be zero`() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.minusBtn?.shouldClick()
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("0")
    }

    @Test
    fun `zero minus one should be -one`() {
        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.minusBtn?.shouldClick()
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("-1")
    }
}