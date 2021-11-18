package core_java_api_3.string_builder;

public class CreatingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // create an empty stringBuilder, might assign values later
        StringBuilder sb2 = new StringBuilder("animal"); // create a stringBuilder with the value animal
        StringBuilder sb3 = new StringBuilder(10); // create stringBuilder and reserve slots of the 10 characters for its value
    }
}
