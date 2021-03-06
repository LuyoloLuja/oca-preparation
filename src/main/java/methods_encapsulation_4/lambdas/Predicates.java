package methods_encapsulation_4.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
