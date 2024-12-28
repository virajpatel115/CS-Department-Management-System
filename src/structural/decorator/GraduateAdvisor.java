package structural.decorator;

import common.Course;

import java.util.ArrayList;
import java.util.List;

//Concrete Decorator representing a graduate advisor.
public class GraduateAdvisor extends FacultyDecorator {
    public GraduateAdvisor(Faculty faculty) {
        this.faculty = faculty;
        int years = 1;
        courses = faculty.courses;
        courseMax = 3;
    }
    public String getType() {
        return faculty.getType() + " Graduate Advisor, ";
    }
}
