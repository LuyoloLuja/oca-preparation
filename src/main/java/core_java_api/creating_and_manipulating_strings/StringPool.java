package core_java_api.creating_and_manipulating_strings;

public class StringPool {
//    the string pool , also known as the intern pool
//    is a location in the JVM that collects all strings
//    it contains all the literal values that appear in a program
//    strings that don't appear in the string pool are garbaged collected
    public static void main(String[] args) {
        String name = "Fluffy";
        String name2 = "Fluffy";

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
