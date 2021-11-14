package core_java_api.arrays;

import java.util.Arrays;

public class Sorting {
//    you need to import Arrays in order to use the sort() method
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
//        sorting array of strings
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
//        strings sort 1 before 9 hence the output -  10, 100, 9
    }
}
