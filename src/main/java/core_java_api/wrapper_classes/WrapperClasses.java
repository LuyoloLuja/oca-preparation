package core_java_api.wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        Float x = new Float(456f);
        System.out.println(x.intValue());   // prints 456 as an int
//        Character doesn't allow the conversion methods
//        parseInt() returns a primitive, and valueOf() returns a wrapper class
        int primitive = Integer.parseInt("123");    // returns 123 as an int instead of as a String that was parsed
        System.out.println(primitive);
        Integer wrapper = Integer.valueOf("123"); // returns 123 as an Integer wrapper class
        System.out.println(wrapper.getClass().getName());

        int bad1 = Integer.parseInt("a");  // throws NumberFormatException because 'a' is not a number, therefore can't be converted
        int bad2 = Integer.parseInt("123.4");  // throws NumberFormatException - should be a double or a float

    }
}
