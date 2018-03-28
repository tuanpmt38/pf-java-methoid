package methoid;

import java.util.Scanner;

public class FibonaciNumber {
    public static void main(String[] args) {
        System.out.println("Find the number in the fibonacci range");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index in the fibonacci range:");
        int index = scanner.nextInt();
        System.out.println("Fibonaci(" + index + ") = " + findFibonaci(index));
    }

    public static long findFibonaci(int n) {
        if (n < 3) {
            return 1;
        }
        return findFibonaci(n - 1) + findFibonaci(n - 2);
    }
}
