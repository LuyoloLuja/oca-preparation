package methods_encapsulation_4.lambdas;

public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
