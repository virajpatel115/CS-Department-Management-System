package creational.factory;

//Concrete create representing undergraduate degrees.
public class UndergradFactory extends DegreeFactory {
    public Degree createProgram() {
        return new Undergraduate();
    }
}
