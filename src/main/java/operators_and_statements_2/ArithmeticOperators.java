package operators_and_statements_2;

public class ArithmeticOperators {
//    arithmetic are encountered in mathematics
//    +, =, *, /, %
//    they also include unary operators
//    ++, --

//    multiplicative operators (*, /, %) have a higher order of precedence than
//    additive (+, -) operators
//    that means
    static int x = 2 * 5 + 3 * 4 - 8;
//    you first evaluate 2 * 5 and 3 * 4
//    which reduces x = 10 + 12 - 8
//    then evaluate the remaining terms from left-to-right of x
//    which makes x 14

    public static void main(String[] args) {
        System.out.println(ArithmeticOperators.x);
        System.out.println(ArithmeticOperators.y);
    }
//    we can change the order of precedence by wrapping parenthesis around sections you want evaluated first
    static int y = 2 * ((5 + 3) * 4 - 8);
//    y = 2 * (8 * 4 - 8)
//    y = 2 * (32 - 8)
//    y = 2 * 24
//    y = 48

}
