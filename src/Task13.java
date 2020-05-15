public class Task13 {
    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));
    }

    static boolean isAvgWhole(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length == (int) sum / array.length;
    }
}
