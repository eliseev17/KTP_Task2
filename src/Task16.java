public class Task16 {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));
    }

    static double fibonacci(int number) {
        if (number <= 1){
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
