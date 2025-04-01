import java.util.Arrays;
import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr = new int[10];
       int i=0;
       while(n!=0)
       {
           arr[i]=n%10;
           n=n/10;
           i++;
           if(i==10){
               break;
           }
       }
       Arrays.sort(arr,0,i);
       System.out.printf("The smallest element is "+ arr[0]);

   }
   }
