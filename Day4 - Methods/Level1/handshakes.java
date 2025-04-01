import java.util.Scanner;
public class Main {
 public double handshakes(int n){
  double combination = (n*(n-1))/2;
  return combination;
 }
 public static void main(String[] args)
 {
     Scanner scanner = new Scanner(System.in);
     Main obj = new Main();
     int n = scanner.nextInt();
     double result = obj.handshakes(n);
     System.out.println("The total no.of ways is: "+result);
 }
}