package core_java_api.strings.creating_and_manipulating_strings;

public class Concatenation {
//    concatenation is placing one string before another string and combining them
    public static void main(String[] args) {
        System.out.println(1 + 2); // numeric addition - outputs 3
        System.out.println("a" + "b"); // concatenation - outputs ab
        System.out.println(1 + 2 + "c");    // numeric addition & concatenation - 3c

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        String s = "1";
        s += "2"; // s = 12
        s += 3; // 123
        System.out.println(s);
    }
}
