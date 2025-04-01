import  java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = scanner.nextInt();
       int i=1;
       while(i<100){
       {
           int z = n*i;
                   if(z<100){
                       System.out.println(z);
                       i++;
                   }
                   else {
                       break;
                   }

       }
   }}}