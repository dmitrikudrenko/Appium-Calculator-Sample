package io.github.dmitrikudrenko.calculator.operations

import io.github.dmitrikudrenko.core.shouldClick
import io.github.dmitrikudrenko.core.shouldHaveText
import org.testng.annotations.Test

class AdditionOperationTest : AbstractOperationTest() {
    @Test
    fun `one plus one should be two`() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.plusBtn?.shouldClick()
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("2")
    }

    @Test
    fun `zero plus one should be one`() {
        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.plusBtn?.shouldClick()
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("1")
    }

    @Test
    fun `one plus zero should be one`() {
        calculatorScreen?.oneBtn?.shouldClick()
        calculatorScreen?.plusBtn?.shouldClick()
        calculatorScreen?.zeroBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("1")
    }

    @Test
    fun `five plus six should be eleven`() {
        calculatorScreen?.fiveBtn?.shouldClick()
        calculatorScreen?.plusBtn?.shouldClick()
        calculatorScreen?.sixBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("11")
    }

    @Test
    fun `six plus five should be eleven`() {
        calculatorScreen?.sixBtn?.shouldClick()
        calculatorScreen?.plusBtn?.shouldClick()
        calculatorScreen?.fiveBtn?.shouldClick()
        calculatorScreen?.equalsBtn?.shouldClick()
        calculatorScreen?.resultField?.shouldHaveText("11")
    }
}