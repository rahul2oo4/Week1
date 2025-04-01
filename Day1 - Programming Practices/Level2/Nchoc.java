import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of children:");
int children = scanner.nextInt();
System.out.println("Enter number of chocolates:");
int chocolates = scanner.nextInt();
int result1 = chocolates/children;
int result2 = chocolates%children;
System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d",result1,result2); }}

