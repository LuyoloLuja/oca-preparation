package java_basics_1.declaring_and_initializing_variables;

public class DeclaringMultipleVariables {
//    you can declare many variables in the same declaration as long as they are of the same type
    String s1, s2;
    String s3 = "yes", s4 = "no";

//    you can also initialize those values inline as long as they are of the same type
//    there are 3 declarations in this line, but only 1 initialization - i3 = 0
//    each snippet separated by a comma is a little declaration of its own
//    careful with this trick
    int i1, i2, i3 = 0;
//    int num, String value; // does not compile

    public static void main(String[] args) {
        DeclaringMultipleVariables declaringMultipleVariables = new DeclaringMultipleVariables();
        System.out.println(declaringMultipleVariables.i3);
    }
}
