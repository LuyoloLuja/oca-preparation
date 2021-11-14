package core_java_api.arrays;

public class ArrayOfReferences {
    public static void main(String[] args) {
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));  // true - we can use the equals() method because array is an object
        System.out.println(bugs.toString());    // outputs hashCode

        String[] strings = { "stringValue" };
        Object[] object = strings; // valid because object is the super class of String
        String[] againString = (String[]) object; // casting object to string - valid because object is the super class of String
//        againString[0] = new StringBuilder(); // not valid because againString can only take String values
        object[0] = new StringBuilder();    // compiles fine but throws run time exception because we String referred to Object
    }
}
