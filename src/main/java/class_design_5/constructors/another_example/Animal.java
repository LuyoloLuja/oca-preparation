package class_design_5.constructors.another_example;

public class Animal {
    private int age;
    private String name;
    static int x = 1;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends Animal {
//    any valid constructor is acceptable as long as the appropriate arguments to the parent constructor are provided
//    child constructors are not required to call matching parent constructors

    public Gorilla (int age) {
        super(age, "Gorilla");
    }
    public Gorilla() {
        super(5);
    }
}