import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = scanner.nextInt();
       int temp = n;
       int count=0;
       while(n>0)
       {
           n=n/10;
           count++;
       }
       System.out.println(count + " digits");
   }}


