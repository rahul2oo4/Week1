import java.util.Scanner;
public class CelsiusToFahrenheit {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter temperature in Celsius: &quot;);
double celsius = scanner.nextDouble();
double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
System.out.printf(&quot;Temperature in Fahrenheit: %.2f°F\n&quot;,
fahrenheit);
}
}

