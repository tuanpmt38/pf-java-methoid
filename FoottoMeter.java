package methoid;

import java.util.Scanner;

public class FoottoMeter {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Foot to meter ");
            System.out.println("2. Meter to Foot ");
            System.out.println("0. Exit ");
            System.out.println("Enter choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter foot: ");
                    a = sc.nextDouble();
                    System.out.println("Foot to meter"+footToMeter(a));
                    break;
                case 2:
                    System.out.println("Enter meter: ");
                    b = sc.nextDouble();
                    System.out.println("Meter to food: " +meterToFoot(b));
                    break;
                case 3:
                System.exit(0);
            }

        } while (choice != 0);

    }

    public static double footToMeter(double foot) {
        double meter = 0.035 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.297 * meter;
        return foot;
    }
}
