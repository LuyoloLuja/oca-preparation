package class_design_5.inheritance.overrding_methods;

public class Snake extends Reptile {
    @Override
    protected boolean hasLegs() {   // cancels out the overridden Exception
        return false;
    }
    @Override
    protected double getWeight() throws InsufficientDataException { // throws a subclass Exception of the overridden method
        return 2;
    }

    public static void main(String[] args) {
        new Snake().hasLegs();  // does not need to handle the exception coz it was canceled by the child method

        try {
            new Snake().getWeight();    // handle the exception, may be Exception or InsufficientDataException
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        }
    }
}