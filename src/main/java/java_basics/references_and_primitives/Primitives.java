package java_basics.references_and_primitives;

public class Primitives {
//    Java has 8 built-in data types, referred to as primitive types

//     Keyword           |       Type                               |     Example
//     ----------------------------------------------------------------------------
//      boolean          |        true/false                        |      true
//     ----------------------------------------------------------------------------
//      byte             |        8-bit integral value              |      123
//     ----------------------------------------------------------------------------
//      short            |        16-bit integral value             |      123
//     ____________________________________________________________________________
//      int              |        32-bit integral value             |      123
//     ____________________________________________________________________________
//      long             |        64-bit integral value             |      123
//     ____________________________________________________________________________
//      float            |        32-bit floating-point value       |      123.45f
//     ____________________________________________________________________________
//      double           |        64-bit floating-point value       |      123.456
//     ____________________________________________________________________________
//      char             |        16-bit Unicode value              |      'a'

//    float and double are used for decimals
//    float requires the letter f following the number
//    byt, short, int and long are used for numbers without decimal points
//    each numeric type uses twice as many bits as the smaller type.
//    For example 'short' uses twice as many bits as byte does

//    long max = 3123456789; // does not compile because it's larger than an int can take
    long max = 3123456789L; // we should tell Java it is a long by writing L after the number
    int million1 = 1000000;
    int million2 = 1_000_000; // we can use underscores to separate big values for readability
                              // but we can't add them before and after the numbers
}
