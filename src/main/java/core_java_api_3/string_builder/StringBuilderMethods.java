package core_java_api_3.string_builder;

public class StringBuilderMethods {
//    charAt(), indexOf(), length(), and substring()
//    work the same as in String
//    subString() returns a string
    public static void main(String[] args) {
//    append() - adds characters at the end of the stringBuilder
//    StringBuilder append(String str)
//    there are more than 10 character symbols that look the same but with different parameters
//    they allow us to add any character to the stringBuilder
        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);    // 1c-true

//        insert() - add characters to the StringBuilder at the requested index
        StringBuilder sb = new StringBuilder("animal");
        sb.insert(6, "-"); //  inserts a dash at index 7 - which is the end of the stringBuilder
        sb.insert(0, "-");  //  inserts a dash at index 0 - which is the first character
        sb.insert(4, "-"); // inserts at index 4

//        delete() & deleteCharAt()
//        delete() method is the opposite of the insert() method, it deletes characters at requested index
//        deleteCharAt() is convenient when you want to delete one character
//        StringBuilder delete(int start, int end)
//        StringBuilder deleteCharAt(int index)
        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.delete(1, 3); // sb2 = adef does not include the 3rd index
        sb2.deleteCharAt(3); // deletes index 4 - will throw an exception if it is out of the index

//        reverse() - does exactly what it says
        sb2.reverse();
        System.out.println(sb2);

//        toString() - converts stringBuilder to a String
        sb2.toString();
    }
}
