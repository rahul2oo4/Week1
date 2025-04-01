import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d and %d",a,b,add,sub,mul,div);
    }
}
