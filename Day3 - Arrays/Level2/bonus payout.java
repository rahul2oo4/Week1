import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       double[] salary = new double[5];
       double[] years = new double[5];
       double[] newsalary = new double[5];
       double[] bonus = new double[5];
       double totalbonus=0, oldsalary=0, neswsalary=0;
       for(int i=0; i<salary.length; i++)
       {
           System.out.println("Enter the salary of employee " + (i+1));
           salary[i]= scanner.nextDouble();
           System.out.println("Enter the years of service:" );
           years[i]=scanner.nextDouble();
       }
       for(int i=0;i<salary.length;i++)
       {
           if(years[i]>5)
           {
               newsalary[i]=salary[i] + ((salary[i]*5)/100);
           }
           else {
               newsalary[i]=salary[i] + ((salary[i]*2)/100);
           }
       }
       for(int i=0;i<salary.length;i++)
       {
           if(years[i]>5)
           {
               bonus[i] = (salary[i]*5)/100;
           }
           else
           {
               bonus[i] = (salary[i]*2)/100;

           }
       }
       for(int i=0;i<salary.length;i++)
       {
           totalbonus += bonus[i];
           neswsalary += newsalary[i];
           oldsalary += salary[i];
       }
       System.out.println("Total bonus payout is: "+totalbonus);
       for(int i=0;i<salary.length;i++)
       {
           System.out.printf("The old salary of employee 1 is %.2f and the new salary is %.2f\n",salary[i],newsalary[i]);


       }
   }
}

