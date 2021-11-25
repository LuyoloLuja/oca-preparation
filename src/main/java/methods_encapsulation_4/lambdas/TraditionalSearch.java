package methods_encapsulation_4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper());  //
        print(animals, animal -> animal.canSwim()); // returns animals that can swim
        print(animals, animal -> ! animal.canSwim());   // returns animals that can't swim
    }

    static void print(List<Animal> animals, CheckTrait checkTrait) {
        for (Animal animal : animals) {
            if (checkTrait.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
