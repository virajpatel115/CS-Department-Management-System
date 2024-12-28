package common;

import java.util.List;
import java.util.ArrayList;

public class Semester {
    String name;
    ArrayList<Course> courses;

    public Semester(String name){
        this.name = name;
        courses = new ArrayList<Course>();
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public String getName() { return name;}

    public List<Course> getCourses(){
        return courses;
    }
}
