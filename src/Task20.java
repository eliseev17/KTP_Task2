public class Task20 {
    public static void main(String[] args) {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(6));
        System.out.println(boxSeq(9));
    }

    static int boxSeq(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result--;
            } else result += 3;
        }
        return result;
    }
}
