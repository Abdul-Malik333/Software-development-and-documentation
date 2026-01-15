/**
 * Subject interface that manages observers.
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}
