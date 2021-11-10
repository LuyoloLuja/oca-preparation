package operators_and_statements_2.operators;

public class NumericPromotion {
//    NUMERIC PROMOTION RULES
//    if 2 values have different data types java will automatically promote
//    one the values to the larger of the two data types

//    if one of the values is integral and the other a floating point java,
//    will promote the integral to a floating point type

//    smaller data types (byte, short, char) are first promoted to int when
//    they're used in arithmetic operations
//    after promotion and the values have the same type the results will have
//    the same type as their promotion type

//    what is the data type of x * y?
    int x = 2;
    long y = 33; // its long -- since long is larger that int

//    what is the data type of a + b?
    double a = 39.21;
    float b = 2.1f; // double -- since double is larger than long
//    float b = 2.1; // compilation error because you need the explicitly tell java
                     // by providing the f at the end otherwise java will think you want a double
//    float c = 2.19;  // compilation error because this is double

//    what is the data type of i / j?
    static short i = 10;
    static short j = 3; // int but remember (short, byte, char) are converted to int in arithmetic operations

//    what is the output of k * l / m?
    static short k = 14;
    static float l = 13;
    static double m = 30;
    // first convert k to int
    // then convert int k to a float
    // then convert both k and l to a double
    // which result to a double --- 6.06
    public static void main(String[] args) {
        System.out.println(k*l/m);
    }
}