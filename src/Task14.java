import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
    }

    static int[] cumulativeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
        return array;
    }
}
