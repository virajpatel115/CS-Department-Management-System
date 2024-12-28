package structural.decorator;

import common.Course;

import java.util.ArrayList;
import java.util.List;

//Concrete Decorator representing a undergraduate advisor.
public class UndergraduateAdvisor extends FacultyDecorator {
    public UndergraduateAdvisor(Faculty faculty) {
        this.faculty = faculty;
        int years = 1;
        courses = faculty.courses;
        courseMax = 3;
    }

    public String getType() {
        return faculty.getType() + " Undergraduate Advisor, ";
    }
}
