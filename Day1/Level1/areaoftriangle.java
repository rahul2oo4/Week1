import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = scanner.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * Math.pow(2.54, 2);
        System.out.printf("The area of the triangle in square inches is: %.2f\n", areaInches);
        System.out.printf("The area of the triangle in square centimeters is: %.2f\n", areaCm);
    }
}
