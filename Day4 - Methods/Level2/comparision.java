import java.util.Scanner;
public class Main{
   public static int positive(int n)
   {
       if(n>0)
       {
           System.out.print("positive");
           if(n%2==0)
           {
               System.out.println(" even");
           }
           else
           {
               System.out.println(" odd");
           }
       }
       else
       {
           System.out.println("negative");
       }
       return 0;
   }
   public static int compare(int[] n)
   {
       if(n[0]==n[n.length-1])
       {
           System.out.println("equal");
       }
       return 0;
   }
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       int[] numbers = new int[5];
       for(int i =0; i<numbers.length; i++)
       {
           numbers[i]=scanner.nextInt();
       }
       for(int i =0;i<numbers.length;i++)
       {
           int result = positive(numbers[i]);

       }
       int result = compare(numbers);
   }
}
