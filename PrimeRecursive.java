package methoid;

import java.util.Scanner;

public class PrimeRecursive {
    public static void main(String[] args) {
        System.out.println("Find the number in the fibonacci range");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index in the fibonacci range:");
        int index = scanner.nextInt();
        int result = findValuePrime(index);

        System.out.println("The value at position " + index + " in the fibonacci range is: " + result);
    }

    public static int findValuePrime(int index) {
        if (index < 3) {
            return 1;
        }
        return findValuePrime(index - 2) + findValuePrime(index - 1);
    }
}
