package java_basics.references_and_primitives;

public class KeyDifferences {
//    reference types can be assigned null, which means they do currently refer to a object
//    primitive types will give a compiler error if you assign them null
//    Example
//    int value = null; // does not compile
    String s = null; // compiles

//    references can be used to call methods if they do not point to null
//    primitives do not have methods on them
    String reference = "Hello";
    int primitive = reference.length();
//    int bad = primitive.length(); // gibberish because primitive does not have methods
}
