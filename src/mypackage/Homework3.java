package mypackage;

public class Homework3 {
    public static void main(String[] args) {

        //Homework
//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit

        double celsius = 33;

        //T(K) = T(°C) + 273.15
        double kelvin = celsius + 273.15;
        System.out.println(kelvin);
        //T(°F) = T(°C) × 9/5 + 32
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println(fahrenheit);

        //T(°C) = T(K) - 273.15

        double kelvinN = 345.87;
        double celsiusS = kelvinN - 273.15;
        System.out.println(celsiusS);
        //T(°F) = T(K) × 9/5 - 459.67
        double fahrenheitT = kelvinN * 9/5 - 459.67;
        System.out.println(fahrenheitT);





            }
}