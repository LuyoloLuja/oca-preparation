package methods_encapsulation_4;

public class Primitives {
    public void fly(int i) {
        System.out.println("int");
    }
    public void fly(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Primitives p = new Primitives();
        p.fly(5);   // prints int
        p.fly(5L);  // prints long
    }
}
