package exceptions_6;

public class ExceptionTypesHierarchy {
//                                                  java.lang.Object
//                                                          -
//                                                          -
//                                                  java.lang.Throwable
//                                                          -
//                                                          -
//                               java.lang.Exception                    java.lang.Error
//                                        -
//                                        -
//                               java.lang.RuntimeException

//    RuntimeExceptions are also known as unchecked exceptions, they happen when something unexpected happens when the program is running
//    Checked exceptions happen at compile time, you need to handle them or declare them in the method signature
    void fall() throws Exception {
        throw new Exception();
    }
}
