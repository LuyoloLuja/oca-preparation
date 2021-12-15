package class_design_5.inheritance.interfaces;

public interface DefaultMethods {

}
interface IsWarmBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}