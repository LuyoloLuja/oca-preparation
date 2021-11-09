package java_basics_1;

// there can only be one public class in a file
// and its name must match the file name
public class ClassStructure {
}

// a class with fields and methods
class Animal {
    String name;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
}