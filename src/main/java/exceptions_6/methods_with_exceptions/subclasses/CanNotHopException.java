package exceptions_6.methods_with_exceptions.subclasses;

public class CanNotHopException extends Exception {

}
class Hopper {
    public void hop(){

    }
}
class Bunny extends Hopper {
    @Override
    public void hop() throws NullPointerException {     // we can throw a RuntimeException on the subclass's method even though the super
                                                        // doesn't throw any exceptions, but we can't throw checked exceptions
    }
}