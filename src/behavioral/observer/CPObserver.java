package behavioral.observer;

import structural.decorator.ChairPerson;

//Concrete observer for Chairperson.
public class CPObserver implements Observer {
    String value;
    ChairPerson cp;
    Subject mySubject;
    public CPObserver(ChairPerson cp, Subject mySubject){
        this.cp = cp;
        this.mySubject = mySubject;
        mySubject.registerObserver(this);
    }
    public void update(String value){
        this.value = value;
        display();
    }
    public void display() { System.out.println("Message received by Chairperson" + " : " + value); }
}
