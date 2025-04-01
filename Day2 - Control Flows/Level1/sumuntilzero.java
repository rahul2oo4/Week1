import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int total =0;
       int number;
       System.out.println("Enter number:");
       while((number = scanner.nextInt()) != 0){
           total=total+number;
           System.out.println("Enter number:");
       }
       System.out.println(total);

   }}