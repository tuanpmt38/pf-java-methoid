package methoid;

import java.util.Scanner;

public class TemperatureConversion {
    public static double celsiusToFahrenhiet(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenhietToCelsius(double fahrenhiet){
        double celsius = (5.0/9)*(fahrenhiet-32);
        return  celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do{
            System.out.println("Menu:");
            System.out.println("1. Selsius to fahrenheit");
            System.out.println("2. fahrenheit to Selcius");
            System.out.println("0. Exit ");
            System.out.println("Enter choice:");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenhietToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenhiet(celsius));
                    break;
                case 0: System.exit(0);
            }
        }while (choice!=0);

    }
}
