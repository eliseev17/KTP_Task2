public class Task18 {
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
    }

    static boolean isStrangePair(String string1, String string2) {
        // предусматриваем вариант, когда строки имеют длину 0
        // и мы не можем обратиться к charAt(string.length() - 1)
        if (string1.length() == 0 && string2.length() == 0) {
            return true;
        }
        // проверяем равен ли первый символ первой строки последнему символу второй строки
        if (string1.charAt(0) != string2.charAt(string2.length() - 1)) {
            // если не равен то возвращаем false
            return false;
        }
        // иначе возвращаем результат сравнения второго условия,
        // т.к. на данном этапе первое условие всегда true
        return string1.charAt(string1.length() - 1) == string2.charAt(0);
    }
}
