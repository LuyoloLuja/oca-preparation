package java_basics.constructors;

// we use constructors to initialize fields in object creation
// but we can also initialize fields directly in line
public class Chicken {
    int nameEggs = 0; // initialize directly in line
    String name;

    public Chicken() {
        name = "Duke";
    }
}
