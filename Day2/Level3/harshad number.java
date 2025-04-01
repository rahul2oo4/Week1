import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = scanner.nextInt();
       int sum =0;
       int temp = n;
       int count=0;
       while(n>0)
       {
           sum = sum + (n%10);
           n=n/10;

       }
       if(temp%sum==0){
       System.out.println("Harshad number");}
   }}
