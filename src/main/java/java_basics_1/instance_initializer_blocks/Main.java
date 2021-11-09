package java_basics_1.instance_initializer_blocks;

public class Main {
    public static void main(String[] args) {
        new Main();
        {
            System.out.println("Feather");
        }
    }

    { // instance initializer block runs first --- it runs during object creation
        System.out.println("Snow");
    }
}
