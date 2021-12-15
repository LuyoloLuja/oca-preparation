package class_design_5.polymorphism.virtual_methods;

public class Bird {
    public String getName(){
        return "Unknown";
    }
    public void displayBirdInformation() {
        System.out.println("The bird name is: " + getName());
    }
}

class Peacock extends Bird {
    @Override
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayBirdInformation();
    }
}
