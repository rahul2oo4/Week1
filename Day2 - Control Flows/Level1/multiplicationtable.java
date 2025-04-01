import  java.util.Scanner;
public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = scanner.nextInt();
       for(int i=6;i<=9;i++)
       {

           System.out.printf("%d * %d = %d\n",n,i,n*i);
       }
       }
}

