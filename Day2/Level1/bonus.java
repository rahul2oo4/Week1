import  java.util.Scanner;
public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter salary: ");
       double salary = scanner.nextDouble();
       System.out.println("Enter number of years: ");
       int years = scanner.nextInt();
       if(years>5)
       {
           double newsalary = salary + ((double)5/100)*salary;
           System.out.println(newsalary);
       }
       }
}
