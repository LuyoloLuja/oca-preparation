package operators_and_statements_2.statements.ternary_operator;

public class Ternary {
//    ternary operator is the only operator that takes 3 operands, and is the form of
//    booleanExpression ? expression1 : expression2;
//    the ternary operator is a condensed form of an if-then-else

//    let's take a few examples
    public static void main(String[] args) {
        int y = 10;
        final int x;

        if (y > 5) {
            x = 2;
        } else {
            x = 3 * y;
        }

//    is the equivalent of
        int a = 10;
        int b = (a > 5) ? (2 * a) : (3 * a);

//        we can't use different data types for return in a ternary operator
//        but the below statement works coz the print statement can convert both to strings
        System.out.println((a > 5) ? 21 : "Horse");
//        but this does not compile
//        int animal = (a < 91) ? 9 : "Horse";

//        only one of the right-hand expressions of the ternary operator will be evaluated at runtime
        int num1 = 1;
        int num2 = 1;
        final int sum = num1 < 10 ? num1++ : num2++;
        System.out.println(num1 + ", " + num2); // both expressions were true but only the first expression was incremented

//        the second expression will be evaluated only if the first one is false
        final int sum2 = num1 >= 10 ? num1++ : num2++;
        System.out.println(num1 + ", " +num2);
    }
}
