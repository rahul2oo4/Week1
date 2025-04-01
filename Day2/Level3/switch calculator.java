import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        scanner.close();
    }
}
