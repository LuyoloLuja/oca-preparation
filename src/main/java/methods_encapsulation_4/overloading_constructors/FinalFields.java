package methods_encapsulation_4.overloading_constructors;

public class FinalFields {
//    final variable can be initialized in a constructor
    private final int volume;
    private final String name = "The Mouse House";

    public FinalFields(int length, int width, int height){
        volume = length * height * width;
    }
}
