package java_basics_1.declaring_and_initializing_variables;

public class Variables {
//    a variable is a name for a piece of information that stores data
//    when you declare a variable you need state the variable's type along with giving it a name
    String zooName;   // declaring
    int numberAnimals; // declaring

//    initializing a variable is giving it a value
    public static void main(String[] args) {
        Variables variables = new Variables();

        variables.zooName = "The best Zoo"; // initializing
        variables.numberAnimals = 100;  // initializing
    }
}
