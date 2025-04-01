
import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[10];
       for(int i=0; i< array.length; i++)
       {
           System.out.println("Enter the age of student "+(i+1));
           array[i] = scanner.nextInt();
       }
       for(int j =0; j< array.length; j++)
       {
           if(array[j]>=18)
           {
               System.out.printf("The student of age %d, can vote\n",array[j]);
           }
           else
           {
               System.out.printf("The student of age %d, can't vote\n",array[j]);
           }
       }
   }
}
