package structural.decorator;

import common.Course;
//Base Decorator abstract class.
public abstract class FacultyDecorator extends Faculty {
    Faculty faculty;
    public abstract String getType();

}

