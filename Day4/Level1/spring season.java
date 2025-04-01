import java.util.Scanner;

class SpringSeasonSimple {

   public static boolean isSpringSeason(int month, int day) {
       if (month == 3 && day >= 20 && day <= 31) {
           return true;
       } else if (month == 4 && day >= 1 && day <= 30) {
           return true;
       } else if (month == 5 && day >= 1 && day <= 31) {
           return true;
       } else if (month == 6 && day >= 1 && day <= 20) {
           return true;
       } else {
           return false;
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int month = scanner.nextInt();
       int date = scanner.nextInt();

       if (isSpringSeason(month, date)) {
           System.out.println("Its a Spring Season");
       } else {
           System.out.println("Not a Spring Season");
       }
   }
}

