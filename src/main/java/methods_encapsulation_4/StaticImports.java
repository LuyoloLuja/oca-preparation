package methods_encapsulation_4;

import java.util.List;
import static java.util.Arrays.asList;

public class StaticImports {
//    static imports are used to import static members
//    use can use implicit or explicit import
    public static void  main(String... arg) {
        List<String> list = asList("one", "two");
        System.out.println(list.size());
    }
}
