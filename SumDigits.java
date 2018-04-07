package methoid;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digits number: ");
        number = scanner.nextInt();
        System.out.println("Display digits n: " + totalDigitsOfNumber(number));
    }

    public static int totalDigitsOfNumber(int number) {
        int total = 0;
        while (number > 0){
            total = total + number % 10;
            number = number / 10;
        }
        return total;
    }

}