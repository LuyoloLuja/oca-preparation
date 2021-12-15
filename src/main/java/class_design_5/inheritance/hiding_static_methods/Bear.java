package class_design_5.inheritance.hiding_static_methods;

public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();
    }

//    public static void hibernate() {    // does not compile, trying to hide a non-static method by a static method
//        System.out.println("Panda bear is hibernating");
//    }
}