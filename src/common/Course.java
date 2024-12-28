package common;

import common.Student;
import structural.decorator.ChairPerson;
import structural.decorator.Faculty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Course {
    int id;
    String name;
    String description;
    int credits;
    int seats;
    ChairPerson cp;
    Faculty professor;
    Semester semester;
    Queue<Student> waitlist;
    ArrayList<Student> student;

    public Course(int id, String name, String description, int seats, Faculty professor, Semester semester){
        this.id = id;
        this.name = name;
        this.description = description;
        this.seats = seats;
        student = new ArrayList<Student>();
        waitlist = new LinkedList<Student>();

        this.professor = professor;
        professor.addCourse(this);

        this.semester = semester;
        semester.addCourse(this);
    }

    public int getID() { return id; }
    public String getName() { return name; }

    public int getSeats() { return seats; }
    public ChairPerson getCP() { return cp; }

    public void setSeats(int seats) { this.seats = seats; }

    public void addWaitlist(Student student){
        waitlist.add(student);
    }
    public Queue<Student> getWaitlist() { return waitlist;}


    public void addStudent(Student stu){
        student.add(stu);
    }
    public void removeStudent(Student stu){
        student.remove(stu);
    }

    public String format(){
        return name + ": " + description;
    }
}