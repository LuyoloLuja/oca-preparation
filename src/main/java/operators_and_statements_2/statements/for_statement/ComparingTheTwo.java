package operators_and_statements_2.statements.for_statement;

public class ComparingTheTwo {
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println("");
        for (int x = 0; x < names.length; x++) {
            String name = names[x];
            System.out.print(name + ", ");
        }
    }
}
