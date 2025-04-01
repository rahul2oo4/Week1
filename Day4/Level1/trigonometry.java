import java.util.Scanner;
public class Main {
   public static double[] trig(int angle){
       double radians = Math.toRadians(angle);
       double sin = Math.sin(radians);
       double cos = Math.cos(radians);
       double tan = Math.tan(radians);
       return new double[]{radians,sin,cos,tan};
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int angle = scanner.nextInt();
       double[] result = trig(angle);
       System.out.printf("Radians: %f, sin: %f, cos: %f, tan: %f",result[0],result[1],result[2],result[3]);
       }}

