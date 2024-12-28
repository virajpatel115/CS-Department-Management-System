package structural.decorator;

import common.Course;

import java.util.ArrayList;
import java.util.Arrays;

//Concrete component representing a full time faculty.
public class FullTime extends Faculty {
    public FullTime() {
        type = "Full Time Faculty Created: ";
        courses = new ArrayList<>();
        courseMax = 3;
    }
}
