package core_java_api_3.arrays;

import java.util.Arrays;

public class Searching {
//    java allows searching the array - only for sorted arrays
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8 };
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0 - index
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1  because Java needs to subtract 1 to give us the answer
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2  similar to line 12
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5 - tells us that 9 should be inserted at index 5

//        unsorted arrays can be unpredictable when searching
        int[] number = { 3, 2, 1 };
        System.out.println(Arrays.binarySearch(number, 2));
        System.out.println(Arrays.binarySearch(number, 3));
    }
}