package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete subject for when a student drops a class.
public class ClassDropNotif implements Subject {
    private List<Observer> students;
    private String value;

    public ClassDropNotif() { students = new ArrayList<>();}
    public void registerObserver(Observer x) { students.add(x);}
    public void removeObserver(Observer x) { students.remove(x); }

    public void notifyObservers(){
        for(Observer observer: students){
            observer.update(value);
        }
    }

    public void message(String value) {
        this.value = value;
        notifyObservers();
    }
}