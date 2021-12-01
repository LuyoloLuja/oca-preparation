package methods_encapsulation_4.constructors;

public class Bunny {
//    common way of writing a constructor
    private String name;
    char c = 10;
    public Bunny(String name) {
        this.name = name;
    }

    public Bunny() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new Bunny();
    }
}
class Other {
    private String color;
    private int height;
    private int length;

    public Other(int length, int theHeight) {
        length = this.length;   // backward - no good
        height = theHeight;     // fine - because a different name
        this.color = "white";   // fine but redundant
    }

    public static void main(String[] args) {
        Other o = new Other(1, 2);
        System.out.println(o.length + " " + o.height + " " + o.color);
    }
}
