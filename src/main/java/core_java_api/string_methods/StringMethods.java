package core_java_api.string_methods;

public class StringMethods {
    public static void main(String[] args) {
        //    LENGTH -- gives us the length of a string
        String string = "animals";
        int length = string.length(); // outputs 7

//    charAt() -- lets you query the string to find out what is
//    at a specific index, indexes start at 0
        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
//        System.out.println(string.charAt(7)); // throws an exception

//        indexOf() -- looks at characters and finds the first index that matches the desired value
//        it doesn't throw an exception when no value is found, it returns -1
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));

//        substring() -- returns parts of the string,
//        the first parameter is the index to start with for the returned string
//        the optional second parameter is the index where you want to end
        System.out.println(string.substring(3)); // outputs "mals"
        System.out.println(string.substring(string.indexOf('m')));  // outputs "mals" -- same the above except the value is not hard-coded
        System.out.println(string.substring(3, 4)); // outputs m -- takes values from index 3, until, but not including 4
        System.out.println(string.substring(3, 7)); // outputs mals -- takes values from index 3 until 7, but since 7 is the end it prints everything

        System.out.println(string.substring(3, 3)); // empty string -- there are no characters in between 3-3
        System.out.println(string.substring(3, 2)); // throws exception -- cannot reverse to index 2 when we started with index 3
        System.out.println(string.substring(3, 8)); // throws exception -- there is no index 8
    }
}
