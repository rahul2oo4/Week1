import java.util.Scanner;
public class Main {
   public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number:");
       int number = scanner.nextInt();
       if(number%5==0)
       {
           System.out.println("Is the number divisible by 5? Yes");
       }
       else
       {
           System.out.println("Is the number divisible by 5? No");
       }
       }
}