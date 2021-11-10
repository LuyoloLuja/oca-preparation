package operators_and_statements_2.statements.while_statement;

public class DoWhileStatement {
//    unlike a while loop, the do while guarantees that the statement will execute at least once
    public static void main(String[] args) {
        int x = 0;

        do {    // ensures that the statement runs at least once
            x++;
        } while (false);
        System.out.println(x); // outputs 1
    }
}
