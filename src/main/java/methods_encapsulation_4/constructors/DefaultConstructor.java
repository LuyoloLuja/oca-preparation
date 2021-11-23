package methods_encapsulation_4.constructors;

public class DefaultConstructor {
//    if you don't code a constructor java will create one for you - without a parameter
    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor(); // calls the default constructor
    }
}

class Rabbit1 {
    //  has a default constructor - because there is no specified constructor
}
class Rabbit2 {
    // doesn't have a default constructor - coz it has a constructor
    public Rabbit2() {
        System.out.println("Rabbit2 Constructor");
    }
}
class Rabbit3 {
    public Rabbit3(boolean bool){
        System.out.println("Rabbit3 Constructor");
    }  // doesn't have a default constructor - coz it has a constructor
}
class Rabbit4 {
    private Rabbit4() {
        System.out.println("Rabbit4 Constructor");
    }
}

class RabbitMultiply {
    public static void main(String[] args) {
        Rabbit1 rabbit1 = new Rabbit1();    // calls default constructor - Rabbit1 does not have a specified constructor
        Rabbit2 rabbit2 = new Rabbit2();    // calls Rabbit2 constructor
        Rabbit3 rabbit3 = new Rabbit3(false);    // calls Rabbit3 constructor
//        Rabbit4 rabbit4 = new Rabbit4();    // does not compile - Rabbit4 has a private constructor
    }
}