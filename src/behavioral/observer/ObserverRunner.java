package behavioral.observer;

/* Observer classes used in Student enroll and drop methods. This allows the Chairperson to be notified automatically,
and Students on the wait list to be notified and enrolled automatically when possible*/

import common.Semester;
import common.Student;
import common.Course;
import creational.factory.Degree;
import creational.factory.DegreeFactory;
import creational.factory.UndergradFactory;
import structural.decorator.Faculty;
import structural.decorator.FullTime;

public class ObserverRunner {
    public static void main(String[] args) {
        DegreeFactory undergrad = new UndergradFactory();
        Degree obserDeg = undergrad.createProgram();
        obserDeg.major("Observer Degree");

        Semester sem = new Semester("Spring 2024");
        Faculty ft1 = new FullTime();

        Course obs1 = new Course(2010, "Observer 101", "Intro to observing", 2, ft1, sem);

        Student observer = new Student("Obi", obserDeg);
        Student observer2 = new Student("Osaka", obserDeg);
        Student waitlist1 = new Student("Olly", obserDeg);

        observer.enroll(obs1);
        observer2.enroll(obs1);
        waitlist1.enroll(obs1);

        observer.drop(obs1);
    }
}
