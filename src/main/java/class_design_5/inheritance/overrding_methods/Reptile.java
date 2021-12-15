package class_design_5.inheritance.overrding_methods;

public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }
}
