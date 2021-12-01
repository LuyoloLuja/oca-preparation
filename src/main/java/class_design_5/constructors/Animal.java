package class_design_5.constructors;

//    in java, the first statement of every constructor is either a call to another constructor
//    within the class, using this(), or a call to a constructor int the direct parent using super()
//    this and super must always be the first statements of the constructor
//    if the parent class's constructor takes arguments, then the child class's constructor would also take arguments

public class Animal {
    private int age;
    public Animal(int age) {
        super();    // calls the no-arg constructor on Object
        this.age = age;
    }
}
