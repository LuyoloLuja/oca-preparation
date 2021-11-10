package operators_and_statements_2.statements.if_then;

import java.util.Calendar;

public class IfElse {
    public static void main(String[] args) {
        int morningGreetingCount = 0;
        int afternoonGreetingCount = 0;
        int eveningGreetingCount = 0;

        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);
        } else if (hourOfDay < 15){     // order of the else-if is important, imagine if we swapped the first 2 statement with each other
            System.out.println("Good Afternoon");
            afternoonGreetingCount++;
            System.out.println(afternoonGreetingCount);
        } else { // else statement should always be the last statement
            System.out.println("Good Evening");
            eveningGreetingCount++;
            System.out.println(eveningGreetingCount);
        }

//        the if statement condition should always take a boolean expression
//        examples below do not compile
//        int x = 1;
//        if (x) { // does not compile coz x is just an int
//
//        }
//
//        if(x = 5) { // does not compile coz you initialize a value in a if-statement
//
//        }
    }
}
