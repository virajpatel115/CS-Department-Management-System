package common;
import behavioral.interpreter.GradeExpression;
import behavioral.observer.CPObserver;
import behavioral.observer.ClassDropNotif;
import behavioral.observer.ClassFullNotif;
import behavioral.observer.WaitListObserver;
import creational.factory.Degree;

import java.util.*;

public class Student {
    String name;
    Degree program;
    int grade;
    List<Course> courses;
    double gpa;
    public HashMap<Course, Character> grades;
    ClassFullNotif full = new ClassFullNotif();
    ClassDropNotif drop = new ClassDropNotif();

    //Thesis thesis;

    public Student(String name, Degree program){
        this.name = name;
        this.program = program;
        courses = new ArrayList<Course>();
        grades = new HashMap<Course, Character>();
        //this.thesis = thesis;
    }
    public String getName(){ return name;}
    public void displayCourses(){
        for(Course c: courses){
            System.out.println(c);
        }
    }

    private Course getCourseByID(int id){
        for(Course c: courses){
            if(id == c.getID()){
                return c;
            }
        }
        return null;
    }
    public void setGrade(int courseID, char grade){
        grades.put(getCourseByID(courseID), grade);
    }
    public void getGrades(){
        System.out.println("\n" + this.getName() + " Grades: ");
        for (Map.Entry<Course, Character> entry : grades.entrySet()) {
            String courseName = entry.getKey().getName();
            Object grade = entry.getValue();
            System.out.println("Course: " + courseName + ", Grade: " + grade);
        }
    }
    public void getCourses(){
        for(Course c: courses){
            System.out.println(c.getName());
        }
    }

    public void gpa() {
        GradeExpression g = new GradeExpression();
        List<Integer> nums = g.interpret(grades.values());
        for (int i : nums) { gpa += i; }
        gpa = gpa / nums.size();
        System.out.println(this.name + " overall GPA is: " + gpa);
    }

    public void enroll(Course course){
        if(course.getSeats() >0){
            courses.add(course);
            course.addStudent(this);
            course.setSeats(course.getSeats() -1);
            System.out.println(this.name + " enrolled in course: " + course.getName() + ". " + course.getSeats() + " seats remains.");
            if(course.getSeats() == 0){
                CPObserver cp = new CPObserver(course.getCP(), full);
                full.message("course is full");
            }
        }else{
            course.addWaitlist(this);
            System.out.println(this.name + " added to wait list");
        }
    }
    public void drop(Course course){
            if(courses.contains(course)){
                courses.remove(course);
                course.removeStudent(this);
                course.setSeats(course.getSeats() +1);
                System.out.println(this.name + " dropped course: " + course.getName() + " .There is " + course.getSeats() + " seat available in this course now.");

                if (course.getWaitlist().peek() != null) {
                    Student stu = course.getWaitlist().poll();
                    WaitListObserver next = new WaitListObserver(stu, drop);
                    stu.courses.add(course);
                    course.addStudent(stu);
                    course.setSeats(course.getSeats() -1);
                    drop.message(stu.name + " has automatically been enrolled to course from waitlist.");
                    drop.removeObserver(next);
                }
            }else {
                System.out.println("Student cannot drop course they aren't enrolled in");
            }
    }
}

