package methods_encapsulation_4;

public class StaticInitialization {

//    static initializers look like unnamed methods
//    but thy have the static keyword, to specify that they should be run
//    when the class is first used
    private static final int NUM_SECONDS_PER_HOURS; // would not compile if we didn't initialize it coz it is static and final

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOURS = numSecondsPerMinute * numMinutesPerHour;
}

    public static void main(String[] args) {

    }

}