package operators_and_statements_2.statements.switch_statement;

public class CompileTimeConstants {
//    case must be of the same time as the switch statement or else it won't compile
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch(dayOfWeek) { // int, short, byte, char, string or enum supported here
            default:
                System.out.println("Weekday");      // this will be the output, since no case matches the switch
                break;  // terminates the program, otherwise all the other cases will execute too
            case 0:     // since switch is an int, case must also be switch
                System.out.println("Sunday");
                break;
            case 6:     // since switch is an int, case must also be switch
                System.out.println("Saturday");
                break;
        }

//        this will start to execute the default value
//        and since there are no break keywords, it will execute all the other cases
//        following default in their order except for Sunday
//        the order of the cases is important
//        if the value of dayOfWeek was 0, then all statements would execute
//        if the value of dayOfWeek was 6, Saturday would be the output, if there are break statements
        switch(dayOfWeek) { // int, short, byte, char, string or enum supported here
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
        }
    }
}
