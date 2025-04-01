import java.util.Scanner;
public class Main {
   public static boolean vote(int[] age){
   for(int i=0;i< age.length;i++)
   {
       if(age[i]>=18)
       {
           return true;
       }}
           return false;
       }


   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int age[] = new int[3];
       for(int i=0;i<age.length;i++){
           System.out.printf("enter the age of student %d",i+1);
           age[i]= scanner.nextInt();
           boolean result = vote(age);
           if(result)
           {
               System.out.println("Student is eligible to vote");
           }
           else{
               System.out.println("not eligible");
           }


       };
   }
}

