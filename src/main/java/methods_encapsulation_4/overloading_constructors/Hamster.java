package methods_encapsulation_4.overloading_constructors;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) {    // first constructor
        this(weight, "brown");  // when calling a constructor with 'this' - it must always be the first line
        this.weight = weight;
        color = "red";
    }

    public Hamster(int weight, String color) {      // second constructor
        this.color = color;
        this.weight = weight;
    }
}
