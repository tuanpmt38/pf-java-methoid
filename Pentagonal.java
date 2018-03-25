package methoid;

import java.util.Scanner;

public class Pentagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input n:");
            number = scanner.nextInt();
            if (number < 1)
                System.out.println("N must be greater than 1:");
            System.out.println("The number Pentagonal:" + getPentagonalNumber(number));
            break;
        } while (number >= 1);
    }

    public static int getPentagonalNumber(int n) {
        return n = (n * ((3 * n) - 1)) / 2;

    }
}
