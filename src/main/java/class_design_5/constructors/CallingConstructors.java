package class_design_5.constructors;

//  the parent constructor is always executed before the child constructor
class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
//      remember every constructor has a super call - so the parent constructor is being called by the compiler
        System.out.println("Ape");
    }
}
class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
//        Primate
//        Ape
    }
}