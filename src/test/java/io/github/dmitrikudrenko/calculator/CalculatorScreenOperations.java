package io.github.dmitrikudrenko.calculator;

public class CalculatorScreenOperations {
    private final CalculatorScreen calculatorScreen;

    public CalculatorScreenOperations(CalculatorScreen calculatorScreen) {
        this.calculatorScreen = calculatorScreen;
    }

    public void addFiveAndFour() {
        calculatorScreen.getFiveBtn().click();
        calculatorScreen.getPlusBtn().click();
        calculatorScreen.getFourBtn().click();
        calculatorScreen.getEqualsBtn().click();
    }

    public void divideByZero() {
        calculatorScreen.getFiveBtn().click();
        calculatorScreen.getDivBtn().click();
        calculatorScreen.getZeroBtn().click();
        calculatorScreen.getEqualsBtn().click();
    }
}
