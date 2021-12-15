package class_design_5.inheritance.overrding_methods;

public class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20; // overrides the superclass method
                                              // if we removed the 'super' keyword, the method would itself creating an infinite loop
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());    // 50.00
        System.out.println(new Wolf().getAverageWeight());      // 70.00
    }
}