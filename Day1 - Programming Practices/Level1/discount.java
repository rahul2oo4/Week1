public class Main {
    public static void main(String[] args){
        int total_fee = 125000;
        int discount_percentage = 10;
        double final_fee = total_fee *((double)discount_percentage/100);
        double discount_fee = total_fee-final_fee;
        System.out.println("The discount amount is INR "+final_fee+" and the final discounted fee is INR "+ discount_fee);
    }}
