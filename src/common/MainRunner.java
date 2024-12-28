package common;

import creational.factory.*;
import creational.singleton.SingletonCS;
import structural.composite.BossConcentration;
import structural.composite.Concentration;
import structural.composite.RegConcentration;
import structural.decorator.Faculty;
import structural.decorator.FullTime;
import structural.decorator.PartTime;
/* Main running class that is the best representation of the project at a larger scope. Displays all design patterns in use*/
public class MainRunner {
    public static void main (String[] args){
        Semester sem = new Semester("Spring 2024");
        Faculty ft1 = new FullTime();
        Faculty pt1 = new PartTime();

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

        SingletonCS.getInstance().print();
        System.out.println();

        RegConcentration systems = new RegConcentration("Systems", "Information Systems Concentration");
        RegConcentration intro = new RegConcentration("Intro CS", "Beginner CS Classes Concentration");

        Course infosys1 = new Course(123, "information systems 331", "class about information", 2, ft1, sem);
        Course compsci115 = new Course(115, "Comp sci 115", "class about comp sci", 2, pt1, sem);

        systems.addCourse(infosys1);
        intro.addCourse(compsci115);

        System.out.println(ft1.getType());
        ft1.getCourses();
        System.out.println(pt1.getType());
        pt1.getCourses();

        System.out.println("\nConcentration: ");
        System.out.println(systems.format());

        System.out.println("Concentration: ");
        System.out.println(intro.format() + "\n");

        Student student = new Student("Jack", infosys);
        student.enroll(infosys1);

        Student student2 = new Student("Jill", infosys);
        student2.enroll(infosys1);

        Student student3 = new Student("Bob", infosys);
        student3.enroll(infosys1);

        Student student4 = new Student("Lily", infosys);
        student4.enroll(infosys1);
        student4.enroll(compsci115);

        student.drop(infosys1);
        student2.drop(infosys1);

        student4.setGrade(123,'A');
        student4.setGrade(115,'B');

        student4.getGrades();
        student4.gpa();
    }
}
