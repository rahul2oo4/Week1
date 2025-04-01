import java.util.Scanner;
public class OddEvenArrays {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int number = scanner.nextInt();
       if (number <= 0) {
           System.out.println("Error: Please enter a natural number.");
           scanner.close();
           return;
       }
       int[] even = new int[number / 2 + 1];
       int[] odd = new int[number / 2 + 1];
       int evenIndex = 0;
       int oddIndex = 0;
       for (int i = 1; i <= number; i++) {
           if (i % 2 == 0) {
               even[evenIndex] = i;
               evenIndex++;
           } else {
               odd[oddIndex] = i;
               oddIndex++;
           }
       }
       System.out.println("Even Numbers:");
       for (int i = 0; i < evenIndex; i++) {
           System.out.print(even[i] + " ");
       }
       System.out.println();
       System.out.println("Odd Numbers:");
       for (int i = 0; i < oddIndex; i++) {
           System.out.print(odd[i] + " ");
       }
       System.out.println();
   }
}