package structural.composite;

import common.Course;
import common.Semester;
import structural.decorator.Faculty;
import structural.decorator.FullTime;

public class ConcentrationClient {
    public static void main(String[] args){
        Semester sem = new Semester("Spring 2024");

        Faculty ft1 = new FullTime();
        Faculty ft2 = new FullTime();

        Course algo = new Course(123,"Algorithms 101", "algo class", 2, ft1, sem);
        Course cs = new Course(124,"Cyber Systems 101", "algo class", 2, ft1, sem);
        Course pc = new Course(125,"Procedural 101", "algo class", 2, ft2, sem);
        Course is = new Course(125,"Info systems 101", "algo class", 2, ft2, sem);

        RegConcentration systems = new RegConcentration("Systems", "Information Systems Concentration");

        RegConcentration procedural = new RegConcentration("Procedural Languages", "Procedural Languages Concentration");
        RegConcentration objorient = new RegConcentration("Object Oriented Languages", "Object Oriented Languages Concentration");

        Concentration prog = new BossConcentration("Programming Languages", "Information Systems Concentration");
        prog.add(procedural);
        prog.add(objorient);

        objorient.addCourse(algo);
        procedural.addCourse(pc);
        systems.addCourse(cs);
        systems.addCourse(is);

        System.out.println("Concentration: ");
        System.out.println(prog.format());

        System.out.println("Concentration: ");
        System.out.println(systems.format());
    }
}
