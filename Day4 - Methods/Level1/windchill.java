public double calculateWindChill(double temperature, double windSpeed)
class windchill {

   public double wc(double temperature, double windSpeed) {
       double windChill = 35.74 + 0.6215 * temperature +
               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
       return windChill;
   }

   public static void main(String[] args) {
       windchill calculator = new windchill();
       double temperature = 20.0;
       double windSpeed = 10.0;

       double windChill = calculator.wc(temperature, windSpeed);
       System.out.printf("Wind Chill Temperature: %.2f\n", windChill);
   }
}
