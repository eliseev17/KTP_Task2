public class Task15 {
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }

    static int getDecimalPlaces(String number) {
        if (number.contains(".")) {
            return number.length() - number.indexOf('.') - 1;
        } else return 0;
    }
}
