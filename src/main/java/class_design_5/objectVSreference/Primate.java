package class_design_5.objectVSreference;

public class Primate {
    public boolean hasHair() {
        return true;
    }
}
interface HasTail {
    boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object lemurAsObject = lemur;

//        CASTING OBJECTS
        Primate primate = lemur;
//        Lemur lemur2 = primate;   // does not compile
        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}