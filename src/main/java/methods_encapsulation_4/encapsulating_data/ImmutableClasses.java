package methods_encapsulation_4.encapsulating_data;

public class ImmutableClasses {
    private int numberEggs;

    public ImmutableClasses(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
//    this class is immutable because we are sure that it won't change after object creation
//    coz there are no setters and a constructor helps us to make immutable by initializing the value
}
class NotImmutable {
//    it is important to check the return type when creating immutable classes
//    for example a StringBuilder would make the class mutable
    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        System.out.println(problem.getBuilder());   // outputs initial
        sb.append(" added");    // changes the value - reason this class mutable
        System.out.println(problem.getBuilder());
    }
}