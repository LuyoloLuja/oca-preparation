package java_basics.default_initialization_of_variables;

public class LocalVariables {
//    a local variable is a variable declared in a method
//    local variables must be initialised before use
//    they do have default values

//    public int  notValid() {
//        int y = 10;
//        int x;
//        int reply = x + y; // does not compile because x is not initialized
//        return reply;
//    }

    public int valid() {
        int y = 10;
        int x = 3;
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;

        if(check) {
            onlyOneBranch = 1;
            answer = 2;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // fails to compile because 'onlyOneBranch' may not be initialized if the condition is false
    }
}
