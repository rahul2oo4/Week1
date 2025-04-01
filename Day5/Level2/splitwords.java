public class Main {
   public static int func(String a) {
       int count =0;
       for(int i=0; i<a.length();i++)
       {
           if(a.charAt(i)==' ')
           {
               count++;
           }
       }
       String[] arr = new String[count+1];
       int j=0,start=0;
       for(int i=0; i<= a.length();i++)
       {
           if((i==a.length())||(a.charAt(i)== ' '))
           {
               arr[j]=a.substring(start,i);
               j++;
               start = i+1;
           }

       }
       for(int i=0; i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       return arr.length;
   }
   public static void main(String[] args)
   {
       String a = "Rahul Reddy the great";
       int result = func(a);
       System.out.println(result);
       String[] result2 = a.split(" ");
       for(int i=0; i<result2.length;i++)
       {
           System.out.println(result2[i]);
       }

   }
}
