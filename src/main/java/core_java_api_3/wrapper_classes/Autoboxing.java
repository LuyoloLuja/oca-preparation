package core_java_api_3.wrapper_classes;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
//    writing a primitive value to a wrapper class and Java converting it is called
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.0); // [50.0]
        weights.add(new Double(60)); // [50.0, 60.0]
        weights.remove(50.0);   // [60.0]
        weights.get(0); // 60.0 - index

        List<Integer> heights = new ArrayList<>();
        heights.add(null); // we can add null to any reference variable
        heights.get(0); // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);  // removes value at index 1, instead of the value 1
        System.out.println(numbers);
        numbers.remove(new Integer(2)); // removes the actual value and not an index
    }
}
