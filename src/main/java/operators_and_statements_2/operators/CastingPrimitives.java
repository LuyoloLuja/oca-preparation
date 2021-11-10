package operators_and_statements_2.operators;

public class CastingPrimitives {
//    int x = 1.0;  // does not compile, 1.9 is a double
//    short y = 1921222;  // does not compile, the number is a long
//    int z = 9f; // does not compile, 9f is a float
//    long t = 19230129810323;  // does not compile, needs L to tell java its a long

    public static void main(String[] args) {
//        we can fix the above example by casting the results to a smaller type
        int x = (int) 1.0; // outputs 1
        short y = (short) 1921222; // outputs 20678 because numeric overflow occurs
        int z = (int) 9f; // outputs 9
        long t = 19230129810323L;

        short a = 10;
        short b = 3;
//        short c = a + b;  // does not work coz shorts are converted to int in arithmetic operations
//        int c = a + b; // works fine OR
        short d = (short) (a + b);
        System.out.println(4 + 1.0f);
    }
}