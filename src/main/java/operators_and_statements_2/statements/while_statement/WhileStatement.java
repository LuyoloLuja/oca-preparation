package operators_and_statements_2.statements.while_statement;

public class WhileStatement {
//    a while loop is similar to an if statement
//    it contains a boolean expression and a statement
    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {  // checks if there is room in belly and there are still cheese bites left
            bitesOfCheese--;    // runs for as long the above condition is true
            roomInBelly--;      // runs for as long the above condition is true
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void main(String[] args) {
        new WhileStatement().eatCheese(9);
    }
}
