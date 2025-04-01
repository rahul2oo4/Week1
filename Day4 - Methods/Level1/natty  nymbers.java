     import java.util.Scanner;
public class Main{
   public static int natural(int n){
       int sum=0;
       for(int i=0;i<=n;i++)
       {
           sum+=i;
       }
       return sum;
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("number: ");
       int n = scanner.nextInt();
       int result= natural(n);
       System.out.println(result);
   }
}
