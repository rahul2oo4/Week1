   import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number:");
       int n = scanner.nextInt();
       int result =1;
       for(int i=1;i<=n;i++)
       {
           result=result*i;

       }
       System.out.printf("Factorial of %d is %d",n,result);
   }
}
