package class_design_5.inheritance.interfaces;

public interface WalksOnTwoLegs {
}
interface HashTail {
    public int getTailLength();
}
interface HashWhiskers {
    public int getNumberOfWhiskers();
}
interface Seal extends HashTail, HashWhiskers {

}
abstract class HarbourSeal implements HashTail, HashWhiskers {

}

class LeopardSeal extends HarbourSeal {
    @Override
    public int getTailLength() {
        return 9;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}