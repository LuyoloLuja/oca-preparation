package class_design_5.inheritance.abstract_classes;

// abstract classes as with abstract methods, cannot be marked as final
// abstract methods cannot be marked as private
// abstract classes cannot be instantiated
public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}
class Swan extends Animal {
    public String getName() {
        return "Swan";
    }

}