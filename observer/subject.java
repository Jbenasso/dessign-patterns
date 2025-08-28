package observer;

import java.util.ArrayList;

/**
 * Abstract class representing a Subject in the Observer design pattern.
 * A Subject maintains a list of observers and notifies them of changes.

 */
public abstract class subject {
    protected ArrayList<Observer> observers;

    /**
     * Constructs a new Subject with no observers.
     */
    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * Registers an observer to this Subject.
     *
     * @param observer the observer to register
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from this Subject.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with the given notice.
     *
     * @param warning true if the notice is a warning
     * @param note    the notice number
     */
    public void notifyObservers(boolean warning, int note) {
        for (Observer o : observers) {
            o.update(warning, note);
        }
    }

    /**
     * Issues a notice, plays the appropriate trumpet sound,
     * and notifies all observers.
     *
     * @param note the notice number
     */
    public abstract void issueNotice(int note);
}
