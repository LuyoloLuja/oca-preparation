package exceptions_6;

public class TryCatch {
    public static void main(String[] args) {
        TryCatch zoo = new TryCatch();
        zoo.explore();
    }

    void fall() {
        throw new RuntimeException();
    }

    void explore() {
        try {
            fall();  // throws RunTimeException
            System.out.println("never get up here");    // Skips this line and goes to catch block
        } catch (RuntimeException e) {
            getUp();    // prints Got Up - handles the exception and continue program flow
        }
        seeAnimals();   // executes after catch block
    }

    void getUp() {
        System.out.println("Got Up");   // Executes at line 17
    }

    void seeAnimals() {
        System.out.println("See animals");   // Executes at line 19
    }
}
