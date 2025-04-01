import java.util.Scanner;
public class Main {
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     double[] arr = new double[5];
     for(int i=0 ; i<arr.length; i++)
     {
         arr[i] = scanner.nextDouble();
     }
     int sum =0;
     for(int j=0; j< arr.length; j++)
     {
         sum += arr[j];
     }
       double mean = sum/ arr.length - 1;
       System.out.println("Mean is "+ mean);

}}
