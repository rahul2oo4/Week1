import java.util.Scanner;
public class Main {
   public static int[] qr(int n,int div ){
       int q =n/div;
       int r=n%div;
       return new int[] {q,r};
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the chocolates: ");
       int n = scanner.nextInt();
       System.out.println("Enter the students: ");
       int div = scanner.nextInt();
       int[] arr = qr(n,div);
       System.out.printf("%d are distributed to each ,%d are not",arr[0],arr[1]);
   }
}
