package core_java_api_3.strings.string_methods;

public class MethodChaining {
    public static void main(String[] args) {
        String start = "AniMaL  ";
        String trimmed = start.trim();
        System.out.println(trimmed);

        String lowercase = trimmed.toLowerCase();
        System.out.println(lowercase);

        String result = lowercase.replace('a', 'A');
        System.out.println(result);

//        we can chain it the above string like this
        start = start.trim().toLowerCase().replace('a', 'A');
        System.out.println(start);
    }
}
