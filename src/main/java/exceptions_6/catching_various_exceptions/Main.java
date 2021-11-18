package exceptions_6.catching_various_exceptions;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.visitPorcupine();
    }

    public void visitPorcupine() {
        try {
            seeAnimals();   // will print See animals if there is no exception
        } catch (AnimalsOutForAWalk e) {
            System.out.println("Come back later");  // will print Come Back Later if AnimalsOutForWalk exception is caught
        } catch (ExhibitClosed e) {
            System.out.println("Not today");    // will print Come Back Later if ExhibitClosed exception is caught
        }
    }
//    Exceptions are caught in the order they appear
    void seeAnimals() {
        System.out.println("See animals");
    }

//    a superclass can't be caught before a subclass - it will cause a compilation error
    public void visitMonkey() {
        try {
            seeAnimals();
        } catch (ExhibitClosedForLunch e) {     // subclass exception
            System.out.println("Come back later");
        } catch (ExhibitClosed e) {     // superclass exception
            System.out.println("Not today");
        }
    }
}
