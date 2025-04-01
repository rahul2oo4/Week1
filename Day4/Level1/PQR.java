import java.util.Scanner;
public class Main {
   public static int[] qr(int n,int div ){
       int q =n/div;
       int r=n%div;
       return new int[] {q,r};
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = scanner.nextInt();
       System.out.println("Enter the divisor: ");
       int div = scanner.nextInt();
       int[] arr = qr(n,div);
       System.out.printf("%d is quotient,%d is remainder",arr[0],arr[1]);
   }
}

