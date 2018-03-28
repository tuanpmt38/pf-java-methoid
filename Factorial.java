package methoid;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        int N = scanner.nextInt();
        long factorial = factorialNumber(N);
        System.out.println("The factorial of N is: " + factorial);
    }
    public static long factorialNumber( int number){
        if (number <= 1) {
            return 1;
        }
        return number * factorialNumber(number - 1);
    }
}
