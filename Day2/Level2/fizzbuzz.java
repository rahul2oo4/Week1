
import  java.util.Scanner;
public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = scanner.nextInt();
       if(n>5){
       for(int i=1;i<=n;i++){
           if((i%3==0)&&(i%5==0))
           {
               System.out.println("FizzBuzz");
           }
           else if ((i%3==0)&&(i%5!=0))
           {
               System.out.println("Fizz");
           }
           else if ((i%5==0)&&(i%3!=0))
           {
               System.out.println("Buzz");
           }
           else
           {
               System.out.println(i);
           }}     }}}
