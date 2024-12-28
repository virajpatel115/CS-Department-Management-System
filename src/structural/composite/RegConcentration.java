package structural.composite;

import common.Course;

import java.util.ArrayList;
import java.util.List;

//Leaf defining behavior for concentration objects.
public class RegConcentration extends Concentration {
    String name;
    String description;
    List<Course> courses = new ArrayList<Course>();

    public RegConcentration(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String format() {
        StringBuilder str = new StringBuilder(name + ": " + description + "\nCourses: ");
        for (Course c : courses) {
            str.append(c.getName()).append(", ");
        }
        return str.toString();
    }

}
