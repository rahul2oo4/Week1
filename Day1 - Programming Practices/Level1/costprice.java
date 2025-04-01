 public class Main {
  public static void main(String[] args){
        int costprice = 129;
        int sellingprice = 191;
        int profit = sellingprice - costprice;
        double profitper = ((double)profit / costprice) * 100;
        System.out.println("The cost price is "+costprice+" and selling price is INR "+sellingprice);
        System.out.println("The profit is INR "+profit+" and the profit percentage is "+profitper+ " %");
    }
}