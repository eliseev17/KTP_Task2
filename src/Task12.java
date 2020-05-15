public class Task12 {
    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));
    }

    static int differenceMaxMin(int[] array) {
        int max = -10000, min = 10000;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        return max - min;
    }
}
