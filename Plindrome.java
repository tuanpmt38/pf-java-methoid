package methoid;

import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        System.out.println("Reverse number : ");
        System.out.println(plindromeNumber(number));
    }

    public static int plindromeNumber(int number) {
        int reverse = 0;
        int surplus;
        while (number > 0) {
            surplus = number % 10;
            reverse = reverse * 10 + surplus;
            number /= 10;
        }
        return reverse;
    }
}
