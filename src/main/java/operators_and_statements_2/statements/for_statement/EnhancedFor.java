package operators_and_statements_2.statements.for_statement;

public class EnhancedFor {
//    is designed specifically to loop over arrays and collections
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println(" ");

        java.util.List<String> values = new java.util.ArrayList<>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");

        for (String name : values) {
            System.out.print(name + ", ");
        }

//        the right-hand expression should be an array or an iterable object
//        and the left-hand should be a compatible data type
//        looping through a String will throw a compile-time error
    }
}
