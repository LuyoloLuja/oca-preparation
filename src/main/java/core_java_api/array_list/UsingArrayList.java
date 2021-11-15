package core_java_api.array_list;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   // we can add any Object... Since we didn't specify the type
        int x = 10;
        list.add("hawk");
        list.add(Boolean.TRUE);
        list.add(x);

//        creating an arrayList of Strings
        ArrayList<String> safer = new ArrayList<>();
        safer.add("Sparrow");
//        safer.add(Boolean.TRUE);  // does not compile - cannot add boolean to an arrayList of Strings
        safer.add(0, "robin");
        safer.add(1, "blue jay");
        System.out.println(safer);

//        remove() method
//        removes the first matching value of the arrayList
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal")); // prints false - there is no such value
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds); // []
        System.out.println("-------------");

//        set() method
//        changes one element of the arrayList without changing the size
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk");
        System.out.println(birds2.size());  // 1
        birds2.set(0, "robin");
        System.out.println(birds2.size());
//        birds2.set(1, "luyolo");  // throws IndexOutOfBoundsException
    }

}
