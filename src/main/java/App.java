import calculator.Calculator;

public class App {
    public static void main(String[] args) {
        System.out.println(Calculator.addition.add(15, 4));
        System.out.println(Calculator.subtraction.subtract(15, 4));
        System.out.println(Calculator.multiplication.multiply(15, 4));
        System.out.println(Calculator.division.divide(15, 4));
    }
}
