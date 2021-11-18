package core_java_api_3.arrays;

public class UsingArrays {
    public static void main(String[] args) {
//        we use indexing to access elements in an array
        String[] mammals = { "monkey", "chimp", "donkey" };
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey

//        remember an empty array is given null values
        int[] numbers = new int[10];
        System.out.println(numbers.length); // 10

//        using a enhanced-loop to set each element to a value
        for (int i : numbers) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
//        using basic for-loop to set the numbers
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
            System.out.println(numbers[i]);
        }
    }
}
