package java_basics_1.variable_scope;

public class Scope {
//    there are 2 local variables in the eat method
//    meaning they cannot be accessed outside the method
//    one - piecesOfCheese is declared as a parameter
//    two - bitesOfCheese
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

//    local variables can have a smaller scope - block level scope
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1; // block level variable
        }
//        System.out.println(bitesOfCheese); // does not compile because it goes out of the 'if statement' scope
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while(amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

    public static void main(String[] args) {
        new Scope().eatMore(true, 3);
    }
}
