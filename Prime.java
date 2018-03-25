package methoid;


public class Prime {
    public static void main(String[] args) {
        System.out.println("List number < 10000: ");
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int CheckNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= CheckNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
