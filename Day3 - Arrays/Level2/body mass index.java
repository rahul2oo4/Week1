import java.util.Scanner;
public class BmiCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("no of people: ");
        int num = s.nextInt();
        double[] w = new double[num];
        double[] h = new double[num];
        double[] b = new double[num];
        String[] st = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Weight of person " + (i + 1) + ": ");
            w[i] = s.nextDouble();
            System.out.print("Height of person " + (i + 1) + ": ");
            h[i] = s.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            b[i] = w[i] / (h[i] * h[i]);
            if (b[i] < 18.5) {
                st[i] = "Underweight";
            } else if (b[i] < 25) {
                st[i] = "Normal";
            } else if (b[i] < 30) {
                st[i] = "Overweight";
            } else {
                st[i] = "Obese";
            }
        }
        System.out.println("\nResults:");
        System.out.printf("%-10s%-10s%-10s%-20s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-10.2f%-10.2f%-10.2f%-20s\n", h[i], w[i], b[i], st[i]);
        }
            }
}