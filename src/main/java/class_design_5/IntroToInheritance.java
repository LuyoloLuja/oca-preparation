package class_design_5;

public class IntroToInheritance {
//    Java supports single inheritance - a class inherit from one direct class
//    Java also supports multiple levels of inheritance - a class one class may extend another, by which in turn extends another class
//    it possible to prevent a class from being extended by marking it 'final', the code won't compile

//    a class can only be:
//    public or default
//    abstract or final

//    java allows only one public class per source file
}
class Animal {
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Lion extends Animal {
    private void roar() {
        System.out.println("The " + getAge() + " year old Lion says: Roar!");
    }

    public static void main(String[] args) {
//        System.out.println(age);  // does not compile - age is marked private, but we can accees it via the setter method
        Lion lion = new Lion();
        lion.setAge(10);    // compiles fine
        lion.roar();
    }
}