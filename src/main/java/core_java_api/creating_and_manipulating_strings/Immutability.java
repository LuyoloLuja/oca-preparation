package core_java_api.creating_and_manipulating_strings;

class Mutable {
    //    once string object is created it is not allowed to change
    private String s;
    private void setS(String newS) {
        s = newS; // setter makes it mutable
    }
    public String getS() { return s; }
}

final class Immutable {
    //    immutable has only a getter, which makes s impossible to change
    private String s = "Luyolo";
    public String getS() {
        return s;
    }
}

class Main {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat(s2); // s2 is still 12 - proving string's immutability
        System.out.println(s2);
        s2 = s2.concat("3"); // correct way to change a string
        System.out.println(s2);
    }
}
