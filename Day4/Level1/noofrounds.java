 import java.util.Scanner;
public class TriangularRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistanceKm = 5.0; 
        double totalDistanceMeters = totalDistanceKm * 1000; 
        return totalDistanceMeters / perimeter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1 : ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km\n", rounds);    }
}

