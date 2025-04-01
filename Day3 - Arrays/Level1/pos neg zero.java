
import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[5];
       for(int i=0; i< array.length; i++)
       {
           System.out.println("Enter the number "+(i+1));
           array[i] = scanner.nextInt();
       }
       for(int j =0; j< array.length; j++)
       {
           if(array[j]>0)
           {
               if(array[j]%2==0)
               {
                   System.out.printf("The number %d is even\n",array[j]);
               }
               else {
                   System.out.printf("The number %d is odd\n",array[j]);

               }
           }
           else if(array[j]<0)
           {
               System.out.printf("The number %d is negative\n",array[j]);
           }
           else {
               System.out.printf("The number %d is zero\n",array[j]);
           }
       }
       if(array[0]==array[4])
       {
           System.out.println("The first and lsat numbers are equal");
       }
       else if(array[0]>array[4])
       {
           System.out.println("The first number is greater than the last");
       }
       else{
           System.out.println("The last number is greater than the first");
       }
   }
}