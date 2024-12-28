package behavioral.observer;

import common.Student;

//Concrete observer for a student on the wait list.
public class WaitListObserver implements Observer {
    String value;
    Student student;
    Subject mySubject;
    public WaitListObserver(Student student, Subject mySubject){
        this.student = student;
        this.mySubject = mySubject;
        mySubject.registerObserver(this);
    }
    public void update(String value){
        this.value = value;
        display();
    }
    public void display() { System.out.println("Message received by " + student.getName() + " : " + value); }
}
