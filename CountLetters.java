package methoid;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter:");
        String input_name = sc.nextLine();
        System.out.println("Enter char:");
        char c = sc.next().charAt(0);
        System.out.print("\n Count Letters is: " + countsLetter(input_name,c));

    }

    //dem so ky tu
//    public static int countLetter(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            count++;
//        }
//        return count;
//    }

    //dem so lan xuat hien cua ki tu
    public static int countsLetter(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String abc = String.valueOf(s.charAt(i));
            if (Character.toString(c).equalsIgnoreCase(abc)) {
                count++;
            }
        }
        return count;
    }
}
