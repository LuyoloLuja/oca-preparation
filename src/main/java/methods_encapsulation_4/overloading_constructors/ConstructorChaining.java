package methods_encapsulation_4.overloading_constructors;

public class ConstructorChaining {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public ConstructorChaining(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public ConstructorChaining(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public ConstructorChaining(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining(15);
        constructorChaining.print();
    }
}
