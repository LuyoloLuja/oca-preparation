package exceptions_6.catching_various_exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ThrowSecondException {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException ioException) {

            }
        }
        System.out.println(exception());
    }
    private static FileReader read() throws IOException {
        return null;
    }

    public static String exception() {
        String result = "";
        String v = null;

        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }
}
