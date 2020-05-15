public class Task11 {
    // точка входа в программу
    public static void main(String[] args) {
        // выводим результат выполнения метода в соответствии с примером
        System.out.println(repeat("mice",5));
        System.out.println(repeat("hello",3));
        System.out.println(repeat("stop",1));
    }

    // метод, который повторяет каждую букву в строке в n раз
    static String repeat(String string, int n) {
        // объявляем StringBuilder, в который будут записываться символы
        StringBuilder result = new StringBuilder();
        // перебираем исходную строку посимвольно
        for (int i = 0; i < string.length(); i++) {
            // добавляем i-ый символ строки n раз в StringBuilder
            for (int j = 0; j < n; j++) {
                result.append(string.charAt(i));
            }
        }
        // возвращаем строку-результат
        return result.toString();
    }
}
