import java.util.Scanner;
public class Main{
   public static void main(String[] args)
   {
       String a = "rahul REDDY";
      int vowel=0;
      int consonant=0;
String b = a.toLowerCase();
       for(int i=0; i<b.length();i++)
       {
           char ch = b.charAt(i);
           if(ch>='a'&& ch<='z')
           {
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               vowel++;
           }
           else
           {
               consonant++;
           }
       }
   }
       System.out.println("No of vowels: " +vowel);
       System.out.println("No of consonants: " +consonant);
}}


