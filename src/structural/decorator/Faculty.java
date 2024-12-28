package structural.decorator;
import common.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import creational.singleton.SingletonCS;

//Component abstract class.
public abstract class Faculty {
    String type;
    int courseMax;
    List<Course> courses = new ArrayList<Course>();
    public String getType() { return "\n" + type;}
    public void getCourses() {
        System.out.println("Courses Teaching:");
        for (Course c : courses) {
            System.out.print(c.getName() + ", ");
        }
        System.out.print("\n");
    }

    /*Tested with print statements, can validate it works. I commented it out for cleaner print (not that useful info in comparison to the rest).*/
    public void addCourse(Course course) {
        if(courses.size() < courseMax) {
            courses.add(course);
           // System.out.println("Professor is teaching " + course.getName());
        }else{
           // System.out.println("Professor is teaching max courses. Cannot add " + course.getName());
        }
    }
}

