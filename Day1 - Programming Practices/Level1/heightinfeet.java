import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        double cmToInches = 1 / 2.54;
        double inches = heightCm * cmToInches;
        int feet = (int) inches / 12;
        int remainingInches = (int) inches % 12;
        System.out.printf("Your height in cm is %.2f while in feet it is %d feet and %d inches.\n",
                heightCm, feet, remainingInches);
    }
}
