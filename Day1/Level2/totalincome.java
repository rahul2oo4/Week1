import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the salary: ");
int salary = scanner.nextInt();
System.out.println("Enter the bonus: ");
int bonus = scanner.nextInt();
int result = salary + bonus;
System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d",salary,bonus,result);
}}


