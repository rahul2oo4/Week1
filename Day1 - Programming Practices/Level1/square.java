import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter perimeter: ");
        int perimeter = scanner.nextInt();
        int side = perimeter/4;
        System.out.printf("The length of the side is %d whose perimeter is %d",side,perimeter);
                   }}