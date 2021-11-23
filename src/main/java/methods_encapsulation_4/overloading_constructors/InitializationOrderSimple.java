package methods_encapsulation_4.overloading_constructors;

public class InitializationOrderSimple {
//    1. If there is a superclass, then initialize it first
//    2. Static variable and static initializer block in the order they appear
//    3. Instance variables and instance initializer blocks in the order they appear
//    4. The constructor

    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }
    public InitializationOrderSimple() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        InitializationOrderSimple initializationOrderSimple = new InitializationOrderSimple();
    }
}

class InitializationOrder {
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {
        COUNT++;
        System.out.println(COUNT);
    }
    public InitializationOrder() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder();
    }
}