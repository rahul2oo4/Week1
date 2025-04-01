import java.util.Scanner;
public class Main{
   public static int[] method(int n){
       int sum1;
       if(n<=1){
           sum1= n;
       }else{
           int[] recursiveResult = method(n - 1);
           sum1 = n + recursiveResult[0];}
       int sum2 = (n*(n+1))/2;
       return new int[]{sum1,sum2};
   }
   public static void main(String[] args){
       int n = 5;
       int[] result = method(n);
       System.out.printf("Recursion: %d, formula: %d",result[0],result[1]);
   }
}
