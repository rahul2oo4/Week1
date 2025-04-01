import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number:");
       int n = scanner.nextInt();
       int result =1;
       int temp =n;
       while(temp>0)
       {
           result=result*temp;
           temp--;
       }
       System.out.printf("Factorial of %d is %d",n,result);
   }
}