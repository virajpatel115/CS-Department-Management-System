package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete subject for when a course reaches full enrollment.
public class ClassFullNotif implements Subject {
    private List<Observer> faculty;
    private String value;

    public ClassFullNotif() { faculty = new ArrayList<>();}
    public void registerObserver(Observer x) { faculty.add(x);}
    public void removeObserver(Observer x) { faculty.remove(x); }

    public void notifyObservers(){
        for(Observer observer: faculty){
            observer.update(value);
        }
    }

    public void message(String value) {
        this.value = value;
        notifyObservers();
    }
}

