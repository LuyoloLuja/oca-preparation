package java_basics.object_fields;

// order matters for the fields and block of code
public class Egg {
    public Egg() {
        number = 5; // constructor runs last - setting number to 5
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3; // declaring field runs first - setting number to 3
    { number = 4; } // instance initializer block runs second - setting number to 4
}