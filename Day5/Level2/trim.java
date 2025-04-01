import java.util.Scanner;
public class Main{
   public static String func(String a)
   {
       int start =0;
       int end =a.length()-1;
       while (start <= end && a.charAt(start) == ' ') {
           start++;
       }

       while (end >= start && a.charAt(end) == ' ') {
           end--;
       }
       String b = a.substring(start,end+1);
       return b;
   }
   public static void main(String[] args)
   {
       String a = "                          Rahul Reddy              ";
       String result = func(a);
       System.out.println(result);
       String b = a.trim();
       System.out.println(b);

}}



