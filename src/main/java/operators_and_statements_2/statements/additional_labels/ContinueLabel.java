package operators_and_statements_2.statements.additional_labels;

public class ContinueLabel {
//    the continue statement transfer control to the boolean expression
//    that determines if the loop should continue
//    it ends the current iteration of the loop
    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; a <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.println(" " + a + x);
            }
        }
    }
}
