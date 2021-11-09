package java_basics_1.constructors;

public class Constructors {
    public Constructors() {
        System.out.println("In constructor");
    }

    // not a constructor because it has a return type
    public void Constructor() {}

    public static void main(String[] args) {
        // prints "In Constructor"
        new Constructors();
    }
}
