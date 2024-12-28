package structural.decorator;

import common.Course;

import java.util.ArrayList;
import java.util.Arrays;

//Concrete component representing a part time faculty.
public class PartTime extends Faculty {
    public PartTime() {
        type = "Part Time Faculty Created";
        courses = new ArrayList<Course>();
        courseMax = 1;
    }

}
