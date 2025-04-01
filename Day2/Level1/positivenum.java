import java.util.Scanner;
public class Main {
   public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number:");
       int n = scanner.nextInt();
       if(n>0){
           System.out.printf("Positive");
       }
       else if(n<0){
           System.out.println("Negative");
       }
       else {
           System.out.println("Zero");
       }
}}