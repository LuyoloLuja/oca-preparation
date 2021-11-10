package operators_and_statements_2.statements.if_then;
import java.util.Calendar;

public class If {
    static int morningGreetingCount;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

//      without curley braces
        if (hourOfDay < 11)
            System.out.println("Good Morning"); // single line statement, no need for curly braces
            morningGreetingCount++; // always executes because it is not part of the if-statement since there are no curly braces

//      with curley braces
        if (hourOfDay < 11) {
            System.out.println("Good Morning"); // multiple lines must have curly braces
            morningGreetingCount++;
        }
    }
}
