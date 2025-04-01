
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        for(int i=n-1;i<n;i--)
        {
            if(n%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }}

