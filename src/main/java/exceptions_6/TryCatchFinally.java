package exceptions_6;

public class TryCatchFinally {
//    the finally-block always executes whether there's an exception
//    it runs after the catch-block if there's an exception
//    and after the try-block if there's no exception
    public static void main(String[] args) {
        TryCatchFinally zoo = new TryCatchFinally();
        zoo.explore();
    }

    void explore() {
        try {
            seeAnimals();
            fall();  // throws RunTimeException
        } catch (RuntimeException e) {
            getHugFromDaddy();    // prints Get Hug from Daddy - handles the exception and continue program flow
        }finally {
            seeMoreAnimals();   // executes after catch block
        }
        goHome();
    }

    void fall() {
        throw new RuntimeException();
    }

    void seeAnimals() {
        System.out.println("See animals");   // Executes at line 18
    }

    void getHugFromDaddy() {
        System.out.println("Get Hug from Daddy"); // Executes at line 21
    }

    void seeMoreAnimals() {
        System.out.println("See more animals");     // Executes at line 23
    }

    void goHome() {
        System.out.println("Go Home");
    }
}
