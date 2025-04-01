public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();
        int handshakes =  (n * (n - 1)) / 2;
        System.out.printf("The number of possible handshakes is %d",handshakes);
                   }
}
