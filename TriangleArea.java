package methoid;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double edegA, edegB, edegC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter edeg triangle A:");
        edegA = scanner.nextDouble();
        System.out.println("Enter edeg triangle B:");
        edegB = scanner.nextDouble();
        System.out.println("Enter edeg triangle C:");
        edegC = scanner.nextDouble();
        if (isValue(edegA, edegB, edegC)) {
            System.out.println("Display area triangle:" + calculateTriangle(edegA, edegB, edegC));
        } else {
            System.out.println("Input is not correct !");
        }
    }

    public static boolean isValue(double edgeA, double edgeB, double edgeC) {
        boolean check = (edgeA + edgeB) > edgeC && (edgeA + edgeC) > edgeB && (edgeB + edgeC) > edgeA;
        if (check) {
            return true;
        }
        return false;
    }

    public static double calculateTriangle(double edgeA, double edgeB, double edgeC) {
        double halfprimeter = (edgeA + edgeB + edgeC) / 2;
        double area = halfprimeter * (halfprimeter - edgeA) * (halfprimeter - edgeB) * (halfprimeter - edgeC);
        return Math.sqrt(area);
    }
}
