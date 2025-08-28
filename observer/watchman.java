package observer;

/**
 * Watchman class, issues warning notices (army, breach).
 * Extends Subject in the Observer design pattern.
 * 
 * @author Josefa B
 */
public class Watchman extends Subject {

    /**
     * Issues a notice and notifies observers.
     * 1 = Army approaching (one trumpet honk).
     * 2 = City has been breached (two trumpet honks).
     *
     * @param note the notice number (1 or 2)
     */
    @Override
    public void issueNotice(int note) {
        Trumpet.play(true, note);
        notifyObservers(true, note);
    }
}
