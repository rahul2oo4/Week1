import java.util.Scanner;
class factors {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter no.of rows: ");
       int rows = scanner.nextInt();
       System.out.println("Enter no.of columns: ");
       int columns = scanner.nextInt();
       int[][] arr = new int[rows][columns];
       for(int i=0; i<rows; i++)
       {
           for(int j=0; j<columns; j++)
           {
               arr[i][j] = scanner.nextInt();
           }
       }
       int[] array = new int[rows * columns];
       int index = 0;

       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               array[index] = arr[i][j];
               index++;
           }
       }
       for(int i=0; i< array.length;i++){
       System.out.println(array[i]);
       }
}}