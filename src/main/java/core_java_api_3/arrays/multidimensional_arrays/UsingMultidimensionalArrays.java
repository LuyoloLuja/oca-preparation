package core_java_api_3.arrays.multidimensional_arrays;

public class UsingMultidimensionalArrays {
    public static void main(String[] args) {

        int[][] twoD = new int[3][2];

        for(int i = 0; i < twoD.length; i++) {
            System.out.println("Array: "+i);

            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }
    }
}
