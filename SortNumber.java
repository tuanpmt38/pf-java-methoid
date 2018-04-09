package methoid;

public class SortNumber {
    public static void main(String[] args) {
        int[] number = {6, 7, 3, 19, 89, 6};
        sortNumber(number);
        System.out.println("The sequence number is gradually increased: ");
        display(number);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortNumber(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

    }
}
