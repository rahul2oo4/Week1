import java.util.Scanner;
public class Main {
   public double simpleinterest(double principal, double rate, int interest)
   {
       double SI = (principal*rate*interest)/100;
       return SI;
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Main obj = new Main();
       System.out.println("p:");
       double principal = scanner.nextDouble();
       System.out.println("r:");
       double rate = scanner.nextDouble();
       System.out.println("i:");
       int interest = scanner.nextInt();
       double result = obj.simpleinterest(principal,rate,interest);
       System.out.println(result);
   }
}