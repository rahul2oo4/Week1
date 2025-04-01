import java.util.Scanner;
public class Main {
   public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a positive number:");
       int n = scanner.nextInt();
       int result = n*(n+1)/2;
       if(n>0){
           System.out.printf("The sum of %d natural numbers is %d",n,result);
       }
       else {
           System.out.println("The number is not a natural number");
       }

}}
