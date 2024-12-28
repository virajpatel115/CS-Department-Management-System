package creational.factory;

public class DegreeRunner {
    public static void main (String[] args){
        DegreeFactory undergrad = new UndergradFactory();
        DegreeFactory grad = new GradFactory();
        DegreeFactory cert = new CertificateFactory();

        Degree infosys = undergrad.createProgram();
        infosys.major("Information Systems");

        Degree cs = undergrad.createProgram();
        cs.major("Computer Science");

        Degree csms = grad.createProgram();
        csms.major("Computer Science");

        Degree security = cert.createProgram();
        security.major("Security");
    }
}
