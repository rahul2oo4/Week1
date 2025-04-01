import java.util.Scanner;
public class Main {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER Feet:");
        double feet = scanner.nextDouble();
        System.out.println("Enter meters:");
        double meters = scanner.nextDouble();
        System.out.println("Enter miles");
        double miles = scanner.nextDouble();
        System.out.println("Enter kms:");
        double km = scanner.nextDouble();
        System.out.println("Enter yards:");
        double yards = scanner.nextDouble();
        System.out.println("Enter inches:");
        double inches = scanner.nextDouble();
        double result1 = convertKmToMiles(km);
        double result2 = convertMilesToKm(miles);
        double result3 = convertMetersToFeet(meters);
        double result4 = convertFeetToMeters(feet);
        double result5 = convertYardsToFeet(yards);
        double result6 = convertFeetToYards(feet);
        double result7 = convertMetersToInches(meters);
        double result8 = convertInchesToMeters(inches);
        double result9 = convertInchesToCentimeters(inches);
        System.out.printf("km to m : %.2f, miles to km: %.2f, meters to feet: %.2f, feet to meters: %.2f, yards to feet: %.2f, feet to yards: %.2f, meters to inches: %.2f, inches to meters: %.2f, inches to cm: %.2f",
                result1, result2, result3, result4, result5, result6, result7, result8, result9);
        scanner.close();
    }
}
