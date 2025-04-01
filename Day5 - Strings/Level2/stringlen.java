ublic class Main {
   public static int func(String a) {
       int count =0;
       for (int i = 0; i < a.length(); i++) {
           count ++;
       }
       return count;
   }
   public static void main(String[] args)
   {
       String a = "RAHUL reddy";
       int count = func(a);
       if(count==a.length())
       {
           System.out.println("Equal");
       }
       else {
           System.out.println("N0t equal");
       }
   }
}



