package Exercises.casting_primitives;

public class Casting {
    public static void main(String[] args) {
        float num1 = 5.2f;
        short num2 = (short) num1; // casting needed coz short is smaller than float
        int num3 = num2; // no need for casting as int is larger than short
        num3 = (int) num1; // casting needed coz int is smaller than float
        long num4 = num3; // no need for casting as long is larger than int
        num3 = (int) num4; // casting  needed coz int is smaller than long
        double num5 = num4; // no need for casting coz double is larger than long
        num4 = (long) num5; // casting needed coz long is smaller than double
        System.out.println(num5);
    }
}
