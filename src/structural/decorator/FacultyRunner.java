package structural.decorator;


import common.Course;
import common.Semester;

public class FacultyRunner {
    public static void main(String[] args){
        Semester sem = new Semester("Spring 2024");

        Faculty cp = new ChairPerson();

        Faculty ft1 = new FullTime();
        Faculty ft2 = new FullTime();
        Faculty ft3 = new FullTime();

        ft1 = new GraduateAdvisor(ft1);
        ft1 = new ThesisAdvisor(ft1);
        ft2  = new UndergraduateAdvisor(ft2);

        Faculty pt1 = new PartTime();

        Course algo = new Course(129,"Algorithms 101", "intro to algo", 2, ft1, sem);
        Course algo2 = new Course(130,"Algorithms 121", "advanced algo", 2, ft2, sem);
        Course algo3 = new Course(131,"Algorithms 131", "superior algo", 2, pt1, sem);

        System.out.println(ft1.getType());
        ft1.getCourses();
        System.out.println(ft2.getType());
        ft2.getCourses();
        System.out.println(pt1.getType());
        pt1.getCourses();
    }
}
