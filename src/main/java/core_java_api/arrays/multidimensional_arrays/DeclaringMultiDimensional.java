package core_java_api.arrays.multidimensional_arrays;

public class DeclaringMultiDimensional {
    public static void main(String... args) {
        int[][] vars1;  // 2D arrays
        int vars2[][];  // 2D arrays
        int[] vars3[];  // 2D arrays
        int[] vars4[], space[][];   // 2D and 3D array

//        we can specify the size of a multidimensional array in declaration
//        this sets 'rectangle' to the of 3 arrays, and the arrays inside rectangle to have sizes of 2
//        inner arrays can have different sizes though
        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
    }
}
