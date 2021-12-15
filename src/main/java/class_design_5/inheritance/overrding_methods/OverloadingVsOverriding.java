package class_design_5.inheritance.overrding_methods;

//  overloading gives us more freedom than overloading
//  overloaded methods will use a different signature than overridden methods
//  they are similar in the sense that they both include redefining methods
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

class Eagle extends Bird {
    public int fly(int height) {    // overloading the fly() method
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    public static void main(String[] args) {
        new Bird().eat(10);
        new Eagle().eat(20);
    }

//    public int eat(int food) {    // does not compile coz we're trying to override, but we have a different type
//        System.out.println("Bird is eating " + food + " units of food");
//        return food;
//    }
}