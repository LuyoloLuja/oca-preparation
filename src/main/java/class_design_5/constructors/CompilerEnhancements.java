package class_design_5.constructors;

//    java compiler automatically inserts a call to the no-argument constructor super() call
//    if the first statement to the parent constructor
//    Below classes are examples
class Donkey {

}
class Horse {
    public Horse() {}

}
class Zebra2 {
//    java compiles the above constructors as this one
    public Zebra2() {
        super();
    }
}

// if subclass of Mammal does not define a constructor, the code will not compile
// because the compiler tries to call a super() no-argument constructor, but there is no-argument constructor in super class
// the no-argument constructor needs a super call with an argument
class Mammal {
    public Mammal(int age) {}
    public Mammal(String name) {}
}
class Elephant extends Mammal {
    public Elephant() {  // doesn't matter if the child constructor is a no-argument
        super(5);   // calls the parent constructor with argument
    }
    public Elephant(String name) {
        super("Luyolo");
    }
}