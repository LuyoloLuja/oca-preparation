package operators_and_statements_2.operators;

public class UnaryOperators {
    /*
                    Unary Operator      |   Description
                ---------------------------------------------------------------------------------
                           +            |   indicates number is positive, used for addition or
                                        |   string concatenation
                ---------------------------------------------------------------------------------
                           -            |   indicates a literal is negative or negates an
                                        |   an expression
                ---------------------------------------------------------------------------------
                           ++           |   increments a value by 1
                ---------------------------------------------------------------------------------
                           --           |   decrements a values by 1
                ---------------------------------------------------------------------------------
                            !           |   inverts a boolean's logical value
    */

//    the logical complement operator, !, flips the value of a boolean expression
//    if the value is true, it will be converted to false
    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x);// outputs false
        x = !x;
        System.out.println(x); // outputs true
    }
}
