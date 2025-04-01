import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] multiplicationTable = new int[10]; // Array to store results

        // Calculate and store multiplication results
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        scanner.close();
    }
}
