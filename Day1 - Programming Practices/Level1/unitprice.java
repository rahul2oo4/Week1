import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        int unitprice = scanner.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        int finalprice = unitprice*quantity;
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d",finalprice,quantity,unitprice);
                   }
}
