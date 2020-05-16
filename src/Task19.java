public class Task19 {
    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    static boolean isPrefix(String word, String prefix) {
        if (prefix.charAt(prefix.length() - 1) == '-') {
            prefix = prefix.substring(0, prefix.length() - 1);
        } else return false;
        return word.contains(prefix);
    }

    static boolean isSuffix(String word, String suffix) {
        if (suffix.charAt(0) == '-') {
            suffix = suffix.substring(1, suffix.length() - 1);
        } else return false;
        return word.contains(suffix);
    }
}
