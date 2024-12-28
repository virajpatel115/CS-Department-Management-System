package creational.factory;

//Concrete create representing graduate degrees.
public class GradFactory extends DegreeFactory {
    public Degree createProgram() {
        return new Graduate();
    }
}
