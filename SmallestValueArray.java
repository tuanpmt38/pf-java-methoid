package methoid;

public class SmallestValueArray {
    public static int minArray(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {11, 2, 3, 4, 5, 6};
        int index = minArray(array);
        System.out.println("The smallest element value:" + array[index]);
    }
}
