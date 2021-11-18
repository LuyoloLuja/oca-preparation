package core_java_api_3.equality;

public class Equality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);  // false - they point to two different objects, we see by the "new" keyword
        System.out.println(one == three); // true - they point to the same object

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true - literals are pooled, there's only one literal in memory, both x and y point
                                    //        to the same memory location
        String i = "Hello World";
        String j = "Hello World".trim();
        System.out.println(i == j); // false - because we don't have the same String literal, a new objet is created for j

        String k = new String("Hello World");
        String n = "Hello World";
        System.out.println(k == n); // false - a new object is created for k and a new string literal is created for n, therefore
//                                             they point to different objects

//        equality() - checks the actual value for Strings, but they check reference equality for StringBuilders and other objects
        String s1 = "Hello World";
        String s2 = " Hello World".trim();
        System.out.println(s1.equals(s2)); // true

        Equality e1 = new Equality();
        Equality e2 = new Equality();
        Equality e3 = e1;

        System.out.println(e1 == e1 ); // true
        System.out.println(e1 == e2);   // false
        System.out.println(e1.equals(e2)); // false
    }
}
