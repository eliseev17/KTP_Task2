public class Task17 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }

    static boolean isValid(String input) {
        if (input.length() != 5) return false;
        for (int i = 0; i < input.length(); i++) {
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
