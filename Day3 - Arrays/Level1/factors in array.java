import java.util.Scanner;
class factors {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int n = scanner.nextInt();
       int[] array = new int[10];
       int count =0;
       for(int i =1; i<n; i++)
       {
           if(n%i==0)
           {
               array[count] = i;
               count++;
           }
       }
       for(int j=0; j< count; j++)
       {
       System.out.println(array[j]);
       }
}}

