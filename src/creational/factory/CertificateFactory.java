package creational.factory;

public class CertificateFactory extends DegreeFactory {
    public Degree createProgram() {
        return new Certificate();
    }
}
