package operators_and_statements_2.statements.for_statement;

public class NestedLoops {
    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

//        basic for loop
        for (int i = 0; i < myComplexArray.length; i++) {
            int[] mySimpleArray = myComplexArray[i];
            for (int j = 0; j < mySimpleArray.length; j++) {
                System.out.print(mySimpleArray[j]+"\t");
            }
            System.out.println();
        }

//       enhanced loop
        for (int[] mySimpleArray : myComplexArray) {
            for (int items : mySimpleArray) {
                System.out.print(items+"\t");
            }
            System.out.println();
        }
    }
}
