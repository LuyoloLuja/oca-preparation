package operators_and_statements_2.statements.while_statement;

public class WhileVsDoWhile {
//    any while loop can be converted into a do while loop, and vice versa
//    it is recommended to use a while-loop if the code should not execute at all
//    and use a do-while loop if the should execute at least once
    public static void main(String[] args) {
        int x = 10;
//        while loop
        while(x > 10) {
            x--;
        }

//        do while loop
        if (x > 10) {
            do {
                x--;
            } while (x > 10);
        }
    }
}
