package core_java_api.arrays;

public class ArraysOfPrimitives {
    public static void main(String[] args) {

//       array numbers of primitives with a length of 3
//       this sets the values to default, 0 is the default value of ints
        int[] numbers = new int[3];

//        another way to create an array  of int
//        this way we initialize the values
//        java recognizes this as redundant, but it works
        int[] numbers2 = new int[] {42, 55, 99};

//        as a shortcut we can write it as
//        this process is called an anonymous array because we don't specify the type
        int[] numbers3 = {42, 55, 99};

//        we can type the [] before or after the name and adding a space is optional
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

//        multiple arrays in declaration
        int[] ids, types;  // declares 2 arrays of int
        int id[], type;     // declares one array (id) and one variable of int
    }
}
