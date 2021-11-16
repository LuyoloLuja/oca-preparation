package core_java_api.wrapper_classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
