package methoid;

import java.util.Scanner;

public class DayofYear {
    public static void main(String[] args) {
        int year_begin;
        int year_end;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year begin:");
        year_begin = scanner.nextInt();
        System.out.println("Input year end:");
        year_end = scanner.nextInt();

        for (int i = year_begin; i <= year_end; i++) {
            if (isValue(i)) {
                System.out.println("Year: " + i + " has 366 day");
            } else {
                System.out.println("Year: " + i + " has 365 day");
            }
        }
    }

    public static boolean isValue(int year) {
        boolean checkyear4 = year % 4 == 0;
        if (checkyear4) {
            boolean checkyear100 = year % 100 == 0;
            if (checkyear100) {
                boolean checkyear400 = year % 400 == 0;
                if (checkyear400) return true;
            } else {
                return true;
            }
        }
        return false;

    }
}
