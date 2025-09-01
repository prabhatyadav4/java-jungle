import java.util.Scanner;

class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius Converter\n");
        System.out.print("Enter the Temperature in Fahrenheit: ");
        float F = input.nextFloat();

        float C = (F-32)*5.0f/9.0f;

        System.out.println("The value of temperature in Celsius is: " + C);
    }
}
