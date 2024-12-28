package structural.decorator;

import common.Course;

import java.util.ArrayList;
import java.util.Arrays;

//Concrete component representing a chairperson.
public class ChairPerson extends Faculty {
    public ChairPerson() {
        type = "ChairPerson";
        courses = new ArrayList<Course>();
        courseMax = 1;
    }
}