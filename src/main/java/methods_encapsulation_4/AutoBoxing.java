package methods_encapsulation_4;

public class AutoBoxing {
//    Java will find the most specific value, if it is not found then it will do autoboxing
//    if 1 is passed when calling the method then it will take the int method, otherwise it will take the Integer
    public void fly(int numMiles) {}
    public void fly(Integer numMiles) {}
}
