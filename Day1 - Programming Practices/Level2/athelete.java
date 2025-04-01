import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter side 1:");
int side1 = scanner.nextInt();
System.out.println("Enter side2:");
int side2 = scanner.nextInt();
System.out.println("Enter side3:");
int side3 = scanner.nextInt();
int perimeter = side1+side2+side3;;
int distance = 5000;
double rounds = distance/perimeter;
System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.\n", rounds);
}}

