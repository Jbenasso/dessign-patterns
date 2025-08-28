package observer;

/**
 * Greeter class, issues positive notices (messenger, royalty).
 * Extends Subject in the Observer design pattern.
 * 
 * @author Josefa B
 */
public class Greeter extends Subject {

    /**
     * Issues a notice and notifies observers.
     * 1 = Messenger is coming (one fanfare).
     * 2 = Royalty is approaching (two fanfares).
     *
     * @param note the notice number (1 or 2)
     */
    @Override
    public void issueNotice(int note) {
        Trumpet.play(false, note);
        notifyObservers(false, note);
    }
}
