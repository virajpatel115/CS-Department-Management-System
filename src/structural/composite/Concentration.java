package structural.composite;

import common.Course;

import java.util.ArrayList;
import java.util.List;

//Component abstract class.
public abstract class Concentration {
    public void add(Concentration concentration) { throw new UnsupportedOperationException(); }

    public void remove(Concentration concentration) { throw new UnsupportedOperationException(); }

    public String format() { throw new UnsupportedOperationException(); }
}

