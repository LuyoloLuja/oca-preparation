package core_java_api.string_builder;

public class Mutability {
//    unlike string, stringBuilder is not immutable
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println(sb);

        StringBuilder same = sb.append("+end");
//        here same and sb point to the same object, and print out the same output

        System.out.println(same);
        System.out.println(sb);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b.append("f").append("g");
        System.out.println(a);
        System.out.println(b);
//        there's only one object created here (one new keyword) meaning that both a and b point at one object
//        so changing any of these variables changes the entire object

    }
}
