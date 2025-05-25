public class App {
     public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double c = 25;
        double f = celsiusToFahrenheit(c);
        System.out.println(c + " °C = " + f + " °F");

        f = 77;
        c = fahrenheitToCelsius(f);
        System.out.println(f + " °F = " + c + " °C");
    }
}
