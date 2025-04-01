import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first number: ");
int n1 = scanner.nextInt();
System.out.println("Enter the second number: ");
int n2 = scanner.nextInt();
int temp=n1;
n1 = n2;
n2 = temp;
System.out.printf("The swapped numbers are %d and %d",n1,n2);
}}