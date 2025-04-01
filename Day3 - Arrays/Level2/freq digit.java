import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number == 0) {
            System.out.println("Frequency of 0: 1");
            return;
        }

        long temp = Math.abs(number); // Handle negative numbers
        int digitCount = 0;
        long temp2 = temp;

        while (temp2 != 0) {
            temp2 /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + ": " + frequency[i]);
            }
        }
    }
}