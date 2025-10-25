package w0401;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator add = (double a, double b) -> a + b;
        Calculator sub = (double a, double b) -> a - b;

        System.out.println(
                performBinaryOperation(100, 200, (a, b) -> a * b));
    }

    static double performBinaryOperation(double a, double b, Calculator calculator) {
        return calculator.calculate(a, b);
    }
}
