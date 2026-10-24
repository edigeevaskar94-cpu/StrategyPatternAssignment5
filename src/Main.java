
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddStrategy());

        double a = 10;
        double b = 5;

        System.out.println("Strategy Pattern - Calculator");

        System.out.println("Addition: " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(a, b));
    }
}
