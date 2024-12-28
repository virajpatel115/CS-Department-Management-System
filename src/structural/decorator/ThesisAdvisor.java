package structural.decorator;

import common.Course;

import java.util.List;

//Concrete Decorator representing a thesis advisor.
public class ThesisAdvisor extends FacultyDecorator {
    public ThesisAdvisor(Faculty faculty) {
        this.faculty = faculty;
        courses = faculty.courses;
        courseMax = 3;
    }

    public String getType() {
        return faculty.getType() + " Thesis Advisor, ";
    }
}
