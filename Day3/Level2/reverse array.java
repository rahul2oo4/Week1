import java.util.Arrays;
import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int temp =n;
       int count =0;
       while(n!=0)
       {
           n=n/10;
           count++;
       }
       int[] arr = new int[count];
       for(int i=0; i<count;i++)
       {
           arr[i]=temp%10;
           temp=temp/10;
       }
       for(int i =0; i<= count-1;i++)
       {
           System.out.print(arr[i]);
       }

   }
}
