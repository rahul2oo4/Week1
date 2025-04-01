import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the month number: ");
       int month = scanner.nextInt();
       System.out.println("Enter the day:");
       int day = scanner.nextInt();
       boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
       if(isSpring){
           System.out.println("It's a Spring season");
       }
       else{
           System.out.println("Not a spring season");
}}}