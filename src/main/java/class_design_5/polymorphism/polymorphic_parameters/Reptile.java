package class_design_5.polymorphism.polymorphic_parameters;

public class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    @Override
    public String getName() {
        return "Alligator";
    }
}
class Crocodile extends Reptile {
    @Override
    public String getName() {
        return "Crocodile";
    }
}
class ZooWalker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile: " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Reptile());
        feed(new Alligator());
        feed(new Crocodile());
    }
}