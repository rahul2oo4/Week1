import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first number: ");
int n1 = scanner.nextInt();
System.out.println("Enter tht second number: ");
int n2 = scanner.nextInt();
int quotient = n1/n2;
int remainder = n1%n2;
System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d",quotient,remainder,n1,n2);
}}