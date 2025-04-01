import java.util.Scanner;
public class Main {
   public static void main (String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter 1st number:");
       int n1 = scanner.nextInt();
       System.out.println("Enter 2nd number:");
       int n2 = scanner.nextInt();
       System.out.println("Enter 3rd number:");
       int n3 = scanner.nextInt();
       if((n1>n2)&&(n1>n3)){
           System.out.println("Is the first number the largest? YES");
           System.out.println("Is the second number the largest? NO");
           System.out.println("Is the third number the largest? NO");
       }
       else if((n2>n1)&&(n2>n3)){
           System.out.println("Is the first number the largest? NO");
           System.out.println("Is the second number the largest? YES");
           System.out.println("Is the third number the largest? NO");
       }
       else {
           System.out.println("Is the first number the largest? NO");
           System.out.println("Is the second number the largest? NO");
           System.out.println("Is the third number the largest? YES");
       }
}}
t.println("Is the first number the smallest? NO");      }}}