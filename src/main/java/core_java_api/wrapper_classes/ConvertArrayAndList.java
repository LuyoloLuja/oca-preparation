package core_java_api.wrapper_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayAndList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();  // converting list to an array
        String[] stringArray = list.toArray(new String[0]);

        String[] array = { "robin", "hawk" };
        List<String> list2 = Arrays.asList(array); // returns fixed size list

    }
}
