import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = scanner.nextInt();
       int temp = n;
       int sum=0;
       while(n>0)
       {
           sum = sum + (n%10)*(n%10)*(n%10);
           n=n/10;
       }
       if(sum==temp)
       {
           System.out.println("armstrong");
       }
       else {
           System.out.println("Not armstrong");
       }
   }}

