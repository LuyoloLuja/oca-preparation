package java_basics.object_fields;

// it's possible to read and write instance variables directly from the caller
public class Swan {
    int numberEggs; // instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable
    }
}
