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
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
       System.out.println("ENTER Feet:");
   double feet = scanner.nextDouble();
       System.out.println("Enter meters:");
   double meters = scanner.nextDouble();
       System.out.println("Enter miles");
   double miles = scanner.nextDouble();
       System.out.println("Enter kms:");
   double km = scanner.nextDouble();
   double result1 = convertKmToMiles(km);
   double result2 = convertMilesToKm(miles);
   double result3 = convertMetersToFeet(meters);
   double result4 = convertFeetToMeters(feet);
       System.out.printf("km to m : %.2f, miles to km: %.2f, meters to feet: %.2f , feet to meters: %.2f",result1,result2,result3,result4);
   }
}