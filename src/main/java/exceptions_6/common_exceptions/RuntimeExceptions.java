package exceptions_6.common_exceptions;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class RuntimeExceptions {
    public static void main(String[] args) {
        //    Runtime exceptions don't have to be handled or declared

//    ArithmeticException = thrown by the JVM when code attempts to divide by zero
        int answer = 1 / 0; // throws ArithmeticException

//    ArrayIndexOutOfBoundsException - thrown by the JVM when code uses illegal index to access array
        int[] countOfMoose = new int[3];
        System.out.println(countOfMoose[-1]);

//    ClassCastException - thrown by the JVM when an attempt to cast an exception to a subclass of which it is not an instance
        String type = "moose";
//        Integer number = (Integer) type; // does not compile coz Integer is not subclass of String

//    IllegalArgumentException - thrown by the programmer to indicate that a method has passed an illegal argument

//    NullPointerException - thrown by the JVM when there is a null reference where an object is required
//    NumberFormatException - thrown by a programmer when an attempt is made to convert to a numeric type but the string doesn't have an
//                            inappropriate type
    }
}
