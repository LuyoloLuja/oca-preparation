package operators_and_statements_2.statements.additional_labels;

public class LabelStructure {
//    labels allow applications flow to jump to it or break from
//    it is single word preceded by a colon
    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
}
