mport java.util.Scanner;
public class Main {
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     int[] array = new int[10];
     int i=0;
     while (i<array.length)
     {
             System.out.println("Enter number: ");
         int n= scanner.nextInt();
         if(n>0){
             array[i]=n;
         i++;}
         else{break;}
     }
     for (int j = 0; j < array.length; j++) {
         if(array[j]>0)
         System.out.println(array[j]);
     }
     int sum=0;
     for (int z = 0; z < array.length; z++) {
         sum=sum+array[z];
     }
       System.out.println("sum = "+sum);

   }
}