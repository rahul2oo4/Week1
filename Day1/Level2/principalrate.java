import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter Time: ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f\n", 
                          simpleInterest, principal, rate, time);
    }
}

