package exceptions_6.methods_with_exceptions;

public class Bunny {
    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {

        }
    }
    private static void eatCarrot() throws NoMoreCarrotsException {
        System.out.println("No more carrots");
    }
}
