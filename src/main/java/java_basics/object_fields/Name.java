package java_basics.object_fields;

public class Name {
//    read and writing fields directly in line declaring them
    String firstName = "Luyolo"; // writing on field
    String lastName = "Mntuyedwa"; // writing on field
    String fullName = firstName + " " + " " + lastName; // reading firstName and lastName the writing fullName

    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.fullName); // reading full name
    }
}
