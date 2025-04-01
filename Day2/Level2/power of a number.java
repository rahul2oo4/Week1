import  java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = scanner.nextInt();
       System.out.println("Enter power: ");
       int power = scanner.nextInt();
       int result = 1;
       for(int i=1;i<=power;i++)
       {
           result=result*n;
       }
       System.out.println(result);
   }}
