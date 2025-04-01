import java.util.Scanner;
class poundstokg {
   public static void main (String[]args){
       System.out.println("Enter pounds:");
       Scanner sc = new Scanner(System.in);
       double weight = sc.nextDouble();
       double kg = weight*2.2;
       System.out.printf("The weight of the person in pound is %f and in kg is %f", weight, kg);}
}


