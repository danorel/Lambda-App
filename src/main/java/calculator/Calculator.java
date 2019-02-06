package calculator;

import calculator.functionality.*;

public class Calculator {
    public static Multiplication multiplication = (first, second) -> first * second;
    public static Addition addition = (first, second) -> first + second;
    public static Subtraction subtraction = (first, second) -> first - second;
    public static Division division = (first, second) -> first / second;
}
