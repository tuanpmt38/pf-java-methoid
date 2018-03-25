package methoid;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digits n: ");
        n = scanner.nextInt();
        System.out.println("Display digits n: " + totalDigitsOfNumber(n));
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % 10;
            n = n / 10;
        } while (n > 0);
        return total;
    }

}