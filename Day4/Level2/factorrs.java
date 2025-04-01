import java.util.Scanner;
public class Main{
   public static double[] factors(int n){
       int count =0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               count++;
           }
       }
       int[] arr = new int[count];
       int index= 0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               arr[index]=i;
               index++;
           }
       }
       int sum = 0;
       int product = 1;
       double square = 0;
       for(int i =0; i< arr.length;i++)
       {
           sum +=arr[i];
           product*=arr[i];
           square+=Math.pow(arr[i],2);
       }
       return new double[] {sum,product,square};
       }
       public static void main(String[] args)
       {
           Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
          double[] array = factors(n);
          for(int i =0;i< array.length;i++)
          {
              System.out.println(array[i]);

          }
   }
}
