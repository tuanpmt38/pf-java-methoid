package methoid;

public class SmallestValueArray {
    public static int minValue(int[] num) {
        int min = num[0];
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] number = {11, 2, 3, 4, 5, 6};
        int index = minValue(number);
        System.out.println("The smallest element value array: " + number[index]);
    }
}
