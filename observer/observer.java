package observer;

/**
 * Observer interface for the Observer design pattern.
 * Implementing classes will react to notifications issued by a Subject.
 * 
 * @author Josefa Benasso :)
 */
public interface observer {

    /**
     * Called when a Subject notifies its observers.
     *
     * @param warning true if the notice is a warning (from Watchman),
     *                false if the notice is positive (from Greeter).
     * @param note    the notice number (1 or 2).
     */
    void update(boolean warning, int note);
}
