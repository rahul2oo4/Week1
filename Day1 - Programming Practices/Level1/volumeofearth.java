public class Main {
    public static void main(String[] args){
        int radius = 6378;
        double mileradius = 6378 * 0.6;
        double milevolume =((double)4/3)*3.14 * mileradius*mileradius*mileradius;
        double volume = ((double)4/3)*3.14 * radius*radius*radius;
        System.out.printf("The volume of Earth in cubic kilometers is %.2f\n adn cubic miles is %.2f", volume,milevolume);

    }}
