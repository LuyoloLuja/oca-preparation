package exceptions_6.common_exceptions;

public class Errors {
//    Errors extend the Error class
//    They are thrown by the JVM and should not be handled or declared
//    They include:

//    ExceptionInInitializerError - thrown by the JVM when a static initializer throws an exception and doesn't handle it
    static {
        int[] countOfMoose = new int[3];
        int num = countOfMoose[-1]; // throws ExceptionInInitializerError as soon as the main method is run
    }

//    StackOverFlowError - thrown by the JVM when a method calls itself (this is called infinite recursion), or when an infinite loop occurs
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1); // runs infinitely and causes a StackOverFlowError
    }

//    NoClassDefFoundError - thrown by the JVM when a class that the code uses is available at compile time and not at run time

}
