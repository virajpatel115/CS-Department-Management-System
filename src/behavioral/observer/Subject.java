package behavioral.observer;

public interface Subject {
    void registerObserver(Observer x);
    void removeObserver(Observer x);
    void notifyObservers();
}