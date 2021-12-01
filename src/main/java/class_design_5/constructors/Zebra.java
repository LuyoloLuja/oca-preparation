package class_design_5.constructors;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // calls the super constructor with an argument
    }
    public Zebra() {
        this(4);    // calls this class' constructor with an argument
                        // wouldn't have compiled if we called it with 'this' or 'this()',
                        // because there is no default constructor explicitly
    }
}
