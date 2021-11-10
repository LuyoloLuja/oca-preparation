package operators_and_statements_2.operators;

public class Operators {
//    there 3 types of operators in Java
//    unary, binary & ternary
//    and java operators don't necessarily go from left to right
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.println(x);
//        first decrement y to 3, then multiply the results by 2
//        and finally add 3
//        x = 3 + (2 * --y) // multiplication has higher precedence
//        x = 3 + (2 * 3)
//        x = 3 + 6
//        x = 9.0
    }
}
