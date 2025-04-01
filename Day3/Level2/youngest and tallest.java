
import java.util.Arrays;
import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] age = new int[3];
       double[] height = new double[3];
       for (int i = 0; i < age.length; i++) {
           System.out.println("Enter the age: ");
           age[i] = scanner.nextInt();
           System.out.println("Enter the height: ");
           height[i] = scanner.nextDouble();
       }
       Arrays.sort(age);
       Arrays.sort(height);
       System.out.printf("The youngest is %d years old\n",age[0]);
       System.out.printf("The tallest person is %.2f cm tall",height[height.length-1]);
   }
   }

