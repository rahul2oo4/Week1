import java.util.Scanner;
public class Main {
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
       int[] arr = new int[4];
     for(int i = 6; i <=9; i++)
     {
         int z = n*i;
         System.out.println(n + " x " + i + " = " +z);
         arr[i-6] = z;

     }
     for(int j=0; j< arr.length;j++){
       System.out.println(arr[j]);}
   }
}
