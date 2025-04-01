import  java.util.Scanner;
public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = scanner.nextInt();
       for(int i=1;i<n;i++)
       {
           if(i%2==0){
               System.out.println("Even:" +i);
           }
           else{
               System.out.println("Odd: "+i);
           }
       }
   }
}
