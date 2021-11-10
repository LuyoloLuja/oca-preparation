package operators_and_statements_2.operators;

public class IncrementAndDecrement {
//    increment and decrement require special attention be the order they are applied
//    can make a difference in how an operation is processed

    public static void main(String[] args) {
//        pre-increment - operator is placed before the operand
//        the operation is applied first then the value return is the new value of expression
        int x = 0;
        ++x;

//        post-decrement - operator is placed after the operand
//        the original value of the expression is returned, with operator applied after value is returned
        int y = 0;
        y++;

        int count = 0;
        System.out.println(count); // 0
        System.out.println(++count); // 1

        System.out.println(count++); // 1
        System.out.println(count); // 2
        System.out.println(count--); // 2
        System.out.println(count); // 1

        int l = 3;
        int m = ++l * 5 / l-- + --l;
        System.out.println(m);


    }

}
