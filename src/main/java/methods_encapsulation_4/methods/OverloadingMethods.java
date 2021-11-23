package methods_encapsulation_4.methods;

public class OverloadingMethods {
    public void fly(int numMiles) {  }
    public void fly(short numFeet) {  }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {  }
    public void fly(short numFeet, int numMiles) throws Exception {  }

//    return types does not affect the method signature
//    public static void fly(int numFeet) {
////        does not compile because the method that takes int as a parameter already exists
//    }
//    public int fly(int numFeet) {
////        does not compile because the method that takes int as a parameter already exists
//        return 1;
//    }
}
