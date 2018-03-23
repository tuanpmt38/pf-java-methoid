package methoid;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digits n: ");
        n = scanner.nextInt();
        int sum = sumDigits(n);
        System.out.println("Sum digits is:" + sum);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return sum;
    }
}
