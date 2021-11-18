package core_java_api_3.array_list;
import java.util.ArrayList;

public class CreatingArrayList {
//    arrayList needs to be imported
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);  // copies the contents of list2 to list3 - creating a new List (list3) though

//        new ways to create arrayList
//        creating generic lists of Strings
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
    }
}
