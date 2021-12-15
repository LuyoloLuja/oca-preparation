package class_design_5.inheritance.hiding_variables;

public class Rodent {
    protected int tailLength = 4;
    public void getRodentTail() {
        System.out.println("[parentTail = " + tailLength + "]");
    }
}
class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseTail() {
        System.out.println("[childTail = " + tailLength +  "]");
//        super.getRodentTail();
    }

    public static void main(String[] args) {
        new Rodent().getRodentTail();
        new Mouse().getMouseTail();
    }
}