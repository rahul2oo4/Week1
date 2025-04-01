import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total fee: ");
        int total_fee = scanner.nextInt();
        System.out.println("Enter discount percentage: ");
        int discount_percentage = scanner.nextInt();
        double final_fee = total_fee *((double)discount_percentage/100);
        double discount_fee = total_fee-final_fee;
        System.out.println("The discount amount is INR "+final_fee+" and the final discounted fee is INR "+ discount_fee);
    }}