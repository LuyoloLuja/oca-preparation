package methods_encapsulation_4;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.println("String");
    }
    public void fly(Object o) {
        System.out.println("object");
    }

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("Luyolo");    // java will take the string
        r.fly(65);  // java will check for an int, since there is no int, it will do autoboxing and take Integer
                        // because Integer is a subclass of Object
    }
}
