import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter km: ");
        int km = scanner.nextInt();
        double miles = km*0.6;
        System.out.println("The total miles is "+miles+ " miles for the given "+km+ " km");
    }}
