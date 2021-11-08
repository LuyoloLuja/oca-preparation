package java_basics.instance_initializer_blocks;

public class Chick {
    // fields and instance initializer blocks are run in the order they appear in the file
    // The constructor runs after all fields and initializer blocks have run

    private String name = "Fluffy";
    { System.out.println("setting field"); }

    public Chick() {
        System.out.println(name);
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
