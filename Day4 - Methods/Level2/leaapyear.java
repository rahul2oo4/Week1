import java.util.Scanner;
public class Main{
   public static void leapyear(int year){
       if (year > 1582) {

       if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
           System.out.println("leap year");
       }else{
           System.out.println("not a leap year");
       }}}
public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the year: ");
           int year = scanner.nextInt();
           leapyear(year);
       }
   }
