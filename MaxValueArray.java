package methoid;

import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size Array:");
        size = scanner.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element " + i + ":");
            num[i] = scanner.nextInt();
        }
        System.out.println("Display array:");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + "\t");
        int index = maxValueArray(num);
        System.out.println("The max element value array: " + num[index]);
    }

    public static int maxValueArray(int a[]) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
}
