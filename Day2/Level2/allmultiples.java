import  java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = scanner.nextInt();
       for(int i=1;;i++)
       {
           int z = n*i;
                   if(z<100){
                       System.out.println(z);
                   }
                   else {
                       break;
                   }

       }
   }}