package java_basics_1.references_and_primitives;

public class Rerefences {
//    a reference refers to an object (instance of a class)
//    unlike primitives that hold their values in memory where the variable is allocated, references do not
//    hold the value of objects they refer to. Instead, a reference points to an object by storing the address
//    where the object is located, a concept know as 'pointer'. Java does not allow you to know the physical
//    address of an object, you can only use the reference to refer to it
//    Example
    java.util.Date today; // points to a Date object
    String greeting; // points to a String object

    public static void main(String[] args) {
        Rerefences rerefences = new Rerefences();
//    a reference can be assigned to another object of the same type
//    a reference can be assigned to a new object using the 'new' keyword
//    Example
        rerefences.today = new java.util.Date();
        rerefences.greeting = "How are you";
    }
}
