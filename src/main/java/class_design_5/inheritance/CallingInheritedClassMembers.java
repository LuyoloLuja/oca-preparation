package class_design_5.inheritance;

//  java classes may use any public or protected member of a parent class, including
//  methods, primitives, or object references
//  if the parent class and child class are part of the same package, the child may use
//  any default members defined in the parent class
//  the child class may not access any private members of its parent, at least not directly

class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Shark extends Fish {
    private int numberOfFins = 0;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.println("Shark with age: " + getAge());
        System.out.println("and " + size + " meters long");
        System.out.println("with " + this.numberOfFins + " fins");
        System.out.println(super.getAge());
    }

    public static void main(String[] args) {
        Shark shark = new Shark(5);
        shark.displaySharkDetails();
    }
}
