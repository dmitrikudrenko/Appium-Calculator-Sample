package io.github.dmitrikudrenko.calculator.tests;


import io.github.dmitrikudrenko.calculator.CalculatorAbstractTest;
import io.github.dmitrikudrenko.calculator.CalculatorScreenOperations;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OperationTest extends CalculatorAbstractTest {
    @Test
    public void fivePlusFourOperation() {
        String expectedResult = "9";

        CalculatorScreenOperations calculatorScreenOperations =
                new CalculatorScreenOperations(getApplication().calculatorScreen());
        calculatorScreenOperations.addFiveAndFour();

        assertEquals(getApplication().calculatorScreen().getResult(expectedResult), expectedResult);
    }

    @Test
    public void divideByZeroOperation() {
        String expectedResult = "Can't divide by 0";

        CalculatorScreenOperations calculatorScreenOperations =
                new CalculatorScreenOperations(getApplication().calculatorScreen());
        calculatorScreenOperations.divideByZero();

        assertEquals(getApplication().calculatorScreen().getResult(expectedResult), expectedResult);
    }
}
